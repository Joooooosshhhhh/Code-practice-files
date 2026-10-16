from tkinter import *

def submit():

    strand = listbox.curselection()
    if strand:
        print("A student applied a ", listbox.get(strand), " strand")
    else:
        print("No selected strand")


window = Tk()

listbox = Listbox(window, font= ("Constantia", 20))

listbox.pack()

listbox.insert(1,"STEM")
listbox.insert(2,"HUMSS")
listbox.insert(3,"ABM")

submitButton = Button(window, text="SUBMIT", command=submit, font=("Constantia", 15), bg='green', fg='white')

listbox.config(height=listbox.size())

submitButton.pack()

window.mainloop()
