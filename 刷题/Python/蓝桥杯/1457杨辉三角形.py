def C(n, m):
    ni = 1
    mi = 1
    n_mi = 1
    for i in range(1, n + 1):
        ni *= i
    for i in range(1, m + 1):
        mi *= i
    for i in range(1, n - m + 1):
        n_mi *= i
    return int(ni / (mi * n_mi))


N = int(input())
m, n = 0, 0
flag=False
for i in range(50):
    for j in range(i + 1):
        if C(i, j) == N:
            n, m = i, j
            flag=True
            break
    if flag:
        break
M = (1 + n) * n / 2 + m + 1
print(int(M))

# 30%正确，其余答案错误！还需要修改！