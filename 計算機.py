
n1 = input("請輸入數字1? ")
n2 = input("請輸入數字2? ")

operator = input("請輸入+ , - , * , / ")

if(operator == '+'):
    print(int(n1) + int(n2))
elif(operator == '-'):
    print(int(n1) - int(n2))
elif(operator == '*'):
    print(int(n1) * int(n2))
elif(operator == '/'):
    if(int(n2) <= 0):
        print('被除數不能為0')
    else:
        print(int(n1) / int(n2))
else:
    print('請不要亂輸入')