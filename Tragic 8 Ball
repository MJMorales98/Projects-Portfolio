import random
import tkinter as tk
from tkinter import messagebox

root=tk.Tk()
root.title("Tragic 8 Ball")
root.geometry("400x200")
root.minsize(400, 200)
root.maxsize(400, 200)

def userinput():
    uinp = entry.get()
    if uinp == (""):
        messagebox.showwarning("Warning", "Please ask a question")
    elif uinp !=(""):
        messagebox.showinfo("Your Answer", random.choice(answers))

answers=["It is uncertain.",
      "Outlook bad.",
      "You may not rely on it",
      "Ask again later.",
      "Concentrate and ask again.",
      "Reply hazy, try again.",
      "My reply is no.",
      "My sources say no."]

entry = tk.Entry(root, width=40, justify='center')
entry.grid_rowconfigure(1, weight=1)
entry.grid_columnconfigure(1, weight=1)
entry.grid(column=3, row=1, padx=80, pady=15)
entry.focus_set()

tk.Button(root, text="Answer my question", padx=10, pady=5, command=userinput).grid(column=3, row=4)

root.mainloop()

