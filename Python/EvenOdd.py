#Hady Salama
#5/18/2018
#APCSP & APCSP Final Project
#Even or Odd Lab in Python


def EvenOdd():
    print()
    num = float(input("Enter a number:      "))
    print("Your number is type:" , type(num))
    if num%2 == 0:
        print("Your number is ", num)
        print("This is an even number")
    else:
        print("Your number is ", num)
        print("This is an odd number")

EvenOdd()
