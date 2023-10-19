from datetime import date

# 创建一个特定的日期
specific_date = date(2023, 8, 20)
print("特定日期:", specific_date)

# 获取当前日期
current_date = date.today()
print("当前日期:", current_date)

# 获取日期的年、月、日
year = specific_date.year
month = specific_date.month
day = specific_date.day

print("年:", year)
print("月:", month)
print("日:", day)

# 格式化日期为字符串
formatted_date = specific_date.strftime("%Y-%m-%d")
print("格式化后的日期:", formatted_date)

'''

题目描述
2020 年春节期间，有一个特殊的日期引起了大家的注意：
2020 年 2 月 2 日。因为如果将这个日期按 “yyyymmdd” 的格式写成一个 8 位数是 20200202，
恰好是一个回文数。我们称这样的日期是回文日期。

有人表示 20200202 是 “千年一遇” 的特殊日子。对此小明很不认同，
因为不到 2 年之后就是下一个回文日期：20211202 即 2021 年 12 月 2 日。

也有人表示 20200202 并不仅仅是一个回文日期，还是一个 ABABBABA 型的回文日期。对
此小明也不认同，因为大约 100 年后就能遇到下一个 ABABBABA 型的回文日期：
21211212 即 2121 年 12 月 12 日。算不上 “千年一遇”，顶多算 “千年两遇”。

给定一个 8 位数的日期，请你计算该日期之后下一个回文日期和下一个 ABABBABA 型的回文日期各是哪一天。

输入描述
输入包含一个八位整数 N，表示日期。

对于所有评测用例，
10000101 ≤ N ≤ 89991231
保证 N 是一个合法日期的 8 位数表示。

输出描述
输出两行，每行 1 个八位数。第一行表示下一个回文日期，第二行表示下一个 ABABBABA 型的回文日期。
'''
