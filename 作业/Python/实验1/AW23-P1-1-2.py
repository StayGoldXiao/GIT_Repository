# AW23-P1-1-2.py
"""
题目2: 欢迎入学
姓名: 肖国涛
学号: 2313203025
班级: 23计科专转本、23大数据(1)(2)
"""
my_name = input()  # 输入你的姓名
# =====================================================
width1 = 30
str1 = 'Welcome to JIT'
width2 = int((30 - len(str1)) / 2)
print('|' + '+' * width1 + '|')
for i in range(3):
    if i == 1:
        # print(f'| Welcome to JIT |')
        print(f'|{" " * width2}{str1}{" " * width2}|')
    else:
        print(f'|{" " * width1}|')
print('|' + '+' * width1 + '|')
print(f'欢迎您,{my_name}同学!')
# =====================================================
