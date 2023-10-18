# AW23-P1-3-1-1.py
"""
题目3-1-1: 鸡兔同笼
姓名: 肖国涛
学号: 2313203025
专业: 计科专转本、大数据
"""

# 输入的空格分隔的两个数，head和feet分别为头和脚的数量
head, feet = input().split()

# =====================================================
head, feet = int(head),int(feet)
rabbit = feet/2-head
chick = head-rabbit


if chick.is_integer() and rabbit.is_integer() and chick >= 0 and rabbit >= 0:
    x = int(chick)
    y = int(rabbit)
    print(f"有 {int(chick)} 只鸡, {int(rabbit)} 只兔")
else:
    print("Data Error")

# =====================================================
