def solution(x):
    str_x = str(x)
    a = 0 #자릿수
    for i in range(len(str_x)):
        a += int(str_x[i])
    if x % a == 0:
        return True
    return False
