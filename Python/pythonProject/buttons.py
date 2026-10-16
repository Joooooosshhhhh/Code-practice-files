from tkinter import *

def click():
    print("Miss mo?")

window = Tk()
window.title("Buttons 101")
window.geometry("420x420")
window.config(background="#4d4d4d")

button = Button(window, text="pindutin mo ako",
                bd=0,
                command=click,
                bg="black",
                fg="white",
                padx=10,
                pady=5,
                font=("Sans Serif", 20))

button.place(relx=0.5, rely=0.5, anchor=CENTER)

window.mainloop()
