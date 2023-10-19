N = int(input())  # 输入三角形的高
M = [list(map(int, input().split())) for i in range(N)]  # 创建二维列表表示三角形
for i in range(1, N):
    for j in range(i + 1):
        if j == 0:
            M[i][j] += M[i - 1][0]
        elif j == i:
            M[i][j] += M[i - 1][-1]
        else:
            M[i][j] += max(M[i - 1][j], M[i - 1][j - 1])
if N & 1:
    print(M[N - 1][N // 2])
elif N & 1 == 0:
    print(max(M[N - 1][N // 2], M[N - 1][N // 2 - 1]))
