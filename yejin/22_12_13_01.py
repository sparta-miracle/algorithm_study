# 짝수의 합
def solution(n):
    answer = 0
    for i in range(1,n):
        if i%2 == 0:
            answer+=i
    return answer
