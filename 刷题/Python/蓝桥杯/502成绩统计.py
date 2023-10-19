n = int(input())
l = []
a = 0
b = 0
for i in range(n):
    l.append(int(input()))
    if l[i] > 85 or l[i] == 85:
        a += 1
    if l[i] > 60 or l[i] == 60:
        b += 1

# 使用round()函数进行四舍五入
print(f"{round(b * 100 / n)}%")
print(f"{round(a * 100 / n)}%")
