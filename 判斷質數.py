import math


n = input("請輸入數字? ")
num = int(n)

if num <= 1:
    print(f"{num} 不是質數")
else:
    is_prime = True
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            is_prime = False
            break
    if is_prime:
        print(f'{num} 是質數')
    else:
        print(f'{num} 不是質數')