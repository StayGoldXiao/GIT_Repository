n = int(input())
list1 = list(int(input()) for i in range(n))
print(max(list1))
print(min(list1))
print("{:.2f}".format(sum(list1) / n))
