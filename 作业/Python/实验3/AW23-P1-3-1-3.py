# AW23-P1-3-1-3.py
"""
题目3-1-3: 二鼠打洞
姓名: 肖国涛
学号: 2313203025
专业: 计科专转本、大数据
"""

n = int(input())
rat, mouse, day, time = 1, 1, 0, 1  # 大鼠进度，小鼠进度，相遇时间，第一天时间
distance_of_rat, distance_of_mouse = 0, 0  # 大鼠和小鼠的打洞距离
# =====================================================
while distance_of_mouse + distance_of_rat < n:
    day += 1
    distance_of_rat += rat
    distance_of_mouse += mouse
    rat *= 2
    mouse /= 2
x = distance_of_mouse + distance_of_rat-n
rat /= 2
mouse *= 2
distance_of_rat -= x * rat / (rat + mouse)
distance_of_mouse -= x * mouse / (rat + mouse)

# =====================================================
print(day)
print(round(distance_of_mouse, 1), round(distance_of_rat, 1))
