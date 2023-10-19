num = 0
for i in range(9999999999):
    j = str(i).count("1")
    num += j
    if num == 2021:
        print(i)
        break
    elif num > 2021:
        print(i - 1)
        break
