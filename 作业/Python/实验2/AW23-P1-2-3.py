# AW23-P1-2-3.py
"""
题目2-3: 学费计算
姓名: 肖国涛
学号: 2313203025
专业: 计科专转本、大数据
"""

python = 3
math = 4
english = 4
physical = 2
military_theory = 2
philosophy = 2
fee = 120

# =====================================================
credit = python + math + english + physical + military_theory + philosophy

tuition = credit * fee

expense = float(input("请输入你每个月的生活费: "))

month = 5
expenses = expense * month
loan = (tuition + expenses) * 0.6

print(f"你本学期选修了{credit}个学分。")
print(f"你应缴纳的学费为{tuition:.2f}元。")
print(f"本学期你能够贷款{loan:.2f}元。")
# =====================================================
