from tkinter import *

window = Tk()
window.title("Volume Scale")

def input():
    print("Volume is:", str(Volume_scale.get()))

Volume_scale = Scale(window,
                     from_=0,
                     to=100,
                     length=300,
                     orient=HORIZONTAL,
                     tickinterval=10,
                     font=('Arial',13,),
                     label='Volume',
                     width= 10)

submit_button = Button(window,
                       text="Ok",
                       padx = 10,
                       pady = 5,
                       bg= '#eb4034',
                       fg= 'white',
                       font= ('Arial', 12),
                       command=input)

Volume_scale.pack()
submit_button.pack()
window.mainloop()