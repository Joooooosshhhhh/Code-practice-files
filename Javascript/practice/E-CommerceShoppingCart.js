class item {
    constructor(name, price, quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity
    }

    getTotalPrice() {
        let product = 0;

        product = this.price * this.quantity; 

        return product;
    }

    isLowStock() {

        if (this.quantity < 5) {
            return true;
        }

        else {
            return false;
        }

    }
}


const inventoryData = [
  { name: "Mechanical Keyboard", price: 85, quantity: 12 },
  { name: "Wireless Mouse", price: 30, quantity: 3 },
  { name: "Gaming Monitor", price: 250, quantity: 2 },
  { name: "USB-C Cable", price: 12, quantity: 25 }
];

const inventoryItem = inventoryData.map (
    data => new item(data.name, data.price, data.quantity)
)

analyzeInventory(inventoryItem);

function analyzeInventory(items) {
    
   let totalValue = 0;
    
    console.log("================ INVENTORY REPORT ================");

    for(let i = 0; i < items.length; i++) {

        let currentItem = items[i];
        totalValue = totalValue + currentItem.getTotalPrice();

        if (currentItem.isLowStock()) {
            console.log(`${currentItem.name} - ${currentItem.price} x ${currentItem.quantity} | Total: $${currentItem.getTotalPrice().toFixed(2)} [LOW STOCK]`);
        }
        
        else {
            console.log(`${currentItem.name} - ${currentItem.price} x ${currentItem.quantity} | Total: $${currentItem.getTotalPrice().toFixed(2)}`);
        }
        
    }
    console.log("==================================================");
    console.log(`Total Inventory Value: $${totalValue.toFixed(2)}`)
}