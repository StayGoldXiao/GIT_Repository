# 已知今天是星期六，请问 20的22次方天后是星期几?
num = pow(20,22)
day = (num+6)%7
if day ==0:
    day=7

print(day)
