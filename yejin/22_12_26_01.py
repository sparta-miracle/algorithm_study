# 하샤드 수

# 방법1
# a=자릿수의 합 구하기(map이용)
# x%a==0 이면, True 반환

def solution(x):
    answer = False
    i,a = x,0
    i = list(map(int, str(i)))
    for b in range(len(i)):
        a += i[b]
    if x%a ==0:
        answer = True
    return answer
