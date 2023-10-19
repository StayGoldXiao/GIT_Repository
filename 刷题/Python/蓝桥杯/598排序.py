str1 = "jonmlkihgfedcba"
str2 = list(str1)
num = 0
for i in range(len(str2)):
    for j in range(len(str2)-i-1):
        if str2[j] > str2[j + 1]:
            str2[j], str2[j + 1] = str2[j + 1], str2[j]
            num += 1
print(str1)

