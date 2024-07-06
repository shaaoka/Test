# 找最小值
def find_min(lst):
    min_value = lst[0]
    for i in range(1,len(lst)):
        if(min_value > lst[i]):
            min_value = lst[i]
    return min_value
#找最大值
def find_max(lst):
    max_value = lst[0]
    for i in range(1,len(lst)):
        if(max_value < lst[i]):
            max_value = lst[i]
    return max_value


list = [1,4,5,0,7,10,35]

print(f'最大值{find_max(list)}')
print(f'最小值{find_min(list)}')