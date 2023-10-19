N = int(input())
list1 = list(map(int, input().split(" ")))
list2 = set()
list2.add(0)
for i in list1:
    for j in list(list2):
        list2.add(i + j)
        list2.add(abs(i - j))
print(len(list2) - 1)
