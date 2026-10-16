'use strict';

console.log('CAMPUS IT SUPPORT REQUEST MANAGER');

// ================================================================
// PART A: STACK
// ================================================================

class Stack {
  constructor() {
    // TODO: Create the internal storage.
    this.item = [];
  }

  push(element) {
    // TODO: Add an element to the top.
    this.item.push(element);
  }

  pop() {
    // TODO: Remove and return the top element.
    return this.item.pop();
  }

  peek() {
    // TODO: Return the top without removing it.
    return this.item[this.item.length - 1];
  }

  isEmpty() {
    // TODO: Return true when empty.
    return this.item.length === 0;
  }

  size() {
    // TODO: Return the number of elements.
    return this.item.length;
  }

  toString() {
    // TODO: Return all elements as text.
    return this.item.toString();
  }
}

console.log('\nPART A: UNDO HISTORY');

const actionHistory = new Stack();

// TODO: Push the three required actions.
// TODO: Display peek, pop, remaining actions, and size.

actionHistory.push("Opened Ticket #101");
actionHistory.push("Assigned Ticket #101");
actionHistory.push("Closed Ticket #101");

console.log("Top Action: ", actionHistory.peek());
console.log("Undo Action: ", actionHistory.pop());
console.log("Remaining Action: ", actionHistory.toString());
console.log("Stack Size: ", actionHistory.size());

// ================================================================
// PART B: QUEUE
// ================================================================

class Queue {
  constructor() {
    // TODO: Create the internal storage.
    this.item = [];
  }

  enqueue(element) {
    // TODO: Add an element at the back.
    this.item.push(element);
  }

  dequeue() {
    // TODO: Remove and return the front element.
    return this.item.shift();
  }

  front() {
    // TODO: Return the front without removing it.
    return this.item[0];
  }

  isEmpty() {
    // TODO: Return true when empty.
    return this.item.length === 0;
  }

  size() {
    // TODO: Return the number of elements.
    return this.item.length;
  }

  toString() {
    // TODO: Return all elements as text.
    return this.item.toString();
  }
}

console.log('\nPART B: WAITING REQUESTS');

const waitingRequests = new Queue();

// TODO: Enqueue the four required requests.
// TODO: Display the front request.
// TODO: Dequeue two requests.
// TODO: Display the remaining queue and its size.

waitingRequests.enqueue("Ticket #201 - Password Reset");
waitingRequests.enqueue("Ticket #202 - No Internet");
waitingRequests.enqueue("Ticket #203 - Printer Problem");
waitingRequests.enqueue("Ticket #204 - Software Installation");

console.log("Next Request: ", waitingRequests.front());
console.log("Processed: ", waitingRequests.dequeue());
console.log("Processed: ", waitingRequests.dequeue());
console.log("Remaining Requests: ", waitingRequests.toString());
console.log("Queue Size: ", waitingRequests.size())

// ================================================================
// PART C: PRIORITY QUEUE
// ================================================================

class PriorityQueue {
  constructor() {
    // TODO: Create the internal storage.
    this.item = [];
  }

  enqueue(request, priority) {
    // TODO: Create an item containing the request and priority.
    // TODO: Find the correct insertion position.
    // TODO: Preserve arrival order when priorities are equal.

    const newItem = {request, priority};
    let added = false;

    for (let i = 0; i < this.item.length; i++) {
        if(newItem.priority < this.item [i].priority) {
            this.item.splice(i, 0, newItem);
            added = true;
            break;
        }
    }

    if(!added) {
        this.item.push(newItem);
    }
  }

  dequeue() {
    // TODO: Remove and return the first item.
    return this.item.shift();
  }

  size() {
    // TODO: Return the number of items.
    return this.item.length;
  }

  print() {
    // TODO: Display every request and priority.
    return this.item.map( item => `${item.request} (priority: ${item.priority})`).join("\n");
  }
}

console.log('\nPART C: URGENT REQUESTS');

const urgentRequests = new PriorityQueue();

// TODO: Enqueue the four required requests.
// TODO: Print the initial priority order.
// TODO: Process the first request.
// TODO: Print the remaining requests.

urgentRequests.enqueue("Ticket #301 - Install Browser", 3);
urgentRequests.enqueue("Ticket #302 - Server Offline", 1);
urgentRequests.enqueue("Ticket #303 - Faculty PC Failure", 2);
urgentRequests.enqueue("Ticket #304 - Internet Laboratory Down", 1);

console.log("Initial Priority Order: ", urgentRequests.print());
console.log("Processed Priority Request: ", urgentRequests.dequeue());
console.log("Remaining Priority Requests: ", urgentRequests.print());

// ================================================================
// PART D: LINKED LIST
// ================================================================

class Node {
  constructor(element) {
    // TODO: Store the element.
    // TODO: Set next to null.

    this.element = element;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    // TODO: Set length to zero.
    // TODO: Set head to null.

     this.length = 0;
     this.head = null;
  }

  append(element) {
    // TODO: Add a node at the end.
    const node = new Node(element);

    if(this.head === null) {
        this.head = node;
    }
    else {
        let current = this.head;
    
    
        while (current.next !== null) {
            current = current.next;
  
        }
        current.next = node;
    }
    
    this.length++
  }

  insert(position, element) {
    // TODO: Reject invalid positions.
    // TODO: Insert at the beginning, middle, or end.

    if (position < 0 || position > this.length) return false;

    const node = new Node(element);
    let current = this.head;

    if (position === 0) {
        node.next = current;
        this.head = node;
    } else {
        let previous = null;
        let index = 0;
        while (index++ < position) {
            previous = current;
            current = current.next;
        }
        node.next = current;
        previous.next = node;
    }

    this.length++;
    return true;
  }

  removeAt(position) {
    // TODO: Reject invalid positions.
    // TODO: Remove the node at the requested position.
    if (position < 0 || position >= this.length) return null;

    let current = this.head;

    if (position === 0) {
        this.head = current.next;
    } 
    
    else {
        let previous = null;
        let index = 0;
        while (index++ < position) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    this.length--;
    return current.element;
  }

  indexOf(element) {
    // TODO: Traverse and return the matching position.
    // TODO: Return -1 when the element is absent.

    let current = this.head;
    let index = 0;

    while (current !== null) {
        if (current.element === element) {
            return index;
        }

        current = current.next;
        index++;
    }

    return -1;
  }

  remove(element) {
    // TODO: Reuse indexOf and removeAt.

    const position = this.indexOf(element);
    return this.removeAt(position);
  }

  isEmpty() {
    // TODO: Return true when no nodes exist.
    return this.length === 0;
  }

  size() {
    // TODO: Return the number of nodes.
    return this.length;
  }

  toString() {
    // TODO: Traverse and return all elements as text.
    let current = this.head; 
    let result = [];         

  
    while (current !== null) {
        result.push(current.element); 
        current = current.next;       
    }
    return result.join("\n");
  }
}

console.log('\nPART D: COMPLETED REQUESTS');

const completedRequests = new LinkedList();

// TODO: Append the three required requests.
// TODO: Insert Ticket #400 at position 0.
// TODO: Insert Ticket #405 at the end.
// TODO: Display the complete list.
// TODO: Search for Ticket #402.
// TODO: Remove the item at position 1.
// TODO: Remove Ticket #403 by value.
// TODO: Display the final list and size.


completedRequests.append("Ticket #401 - Account Activated");
completedRequests.append("Ticket #402 - Printer Connected");
completedRequests.append("Ticket #403 - Antivirus Updated");

completedRequests.insert(0, "Ticket #400 - Computer Diagnosed");
completedRequests.insert(completedRequests.size(), "Ticket #405 - Browser Updated");

console.log(completedRequests.toString());

console.log("Index of Ticket #402 ", completedRequests.indexOf("Ticket #402 - Printer Connected"));
console.log("Removed at Position 1: ", completedRequests.removeAt(1));
console.log("Removed by Value: ", completedRequests.remove("Ticket #403 - Antivirus Updated"))

console.log("Final List: ", completedRequests.toString());
console.log("Final Size:", completedRequests.size());
