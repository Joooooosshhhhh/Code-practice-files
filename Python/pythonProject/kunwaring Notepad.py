from tkinter import *
def submit():
    print(text.get("1.0",END))

window = Tk()
window.title("kunwaring notepad ni Marlon")

text = Text(window, bg="light yellow", font=("Ink Free", 25), height="20", width="15")

button = Button(window, text="submit", pady=5, padx=7, font=("Arial", 15), command=submit)


text.pack()
button.pack()
window.mainloop()

