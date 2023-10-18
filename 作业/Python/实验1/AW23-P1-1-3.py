# AW23-P1-1-3.py
"""
题目3: 数学四则运算
姓名: 肖国涛
学号: 2313203025
班级: 23计科专转本、23大数据(1)(2)
"""

# 第1小题
def que_1():
    """1.3 数学四则运算 第1小题"""
    #=====================================================
    num1 = int(input())
    num2 = int(input())
    print(num1 + num2)
    print(num1 - num2)
    print(num1 * num2)
    print(num1 / num2)
    #=====================================================

# 第2小题
def que_2():
    """1.3 数学四则运算 第2小题"""
    #=====================================================
    num1 = int(input())
    num2 = int(input())
    print("{} + {} = {}".format(num1, num2, num1 + num2))
    print("{} - {} = {}".format(num1, num2, num1 - num2))
    print("{} * {} = {}".format(num1, num2, num1 * num2))
    print("{} / {} = {}".format(num1, num2, num1 / num2))

    #=====================================================

# 第3小题
def que_3():
    """1.3 数学四则运算 第3小题"""
    #=====================================================
    num1 = float(input())
    num2 = float(input())
    print("{} + {} = {:.3f}".format(num1, num2, num1 + num2))
    print("{} - {} = {:.3f}".format(num1, num2, num1 - num2))
    print("{} * {} = {:.3f}".format(num1, num2, num1 * num2))
    print("{} / {} = {:.3f}".format(num1, num2, num1 / num2))
    #=====================================================

if __name__ == '__main__':
    que_i = 1         # 通过这里设置值为1、2、3，分别运行相应的小题代码，
    if que_i == 1:
        que_1()
    elif que_i == 2:
        que_2()
    elif que_i == 3:
        que_3()
    else:
        print('请选择正确的小题编号！')
