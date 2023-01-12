# 하샤드 수

def solution(x):
    answer = True
    num = x
    a=0
    while num>0:
        a += num % 10
        num = num // 10
        print(f'a : {a}')
    if x % a != 0 :
        answer = False
    return answer
print(solution(11))
