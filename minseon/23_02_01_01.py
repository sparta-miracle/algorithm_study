# 피자 나눠 먹기 (2)

def solution(a):
    #유클리드호제법을 사용한 문제풀이
    answer = 0
    b = 6
    c,d = max(a,b),min(a,b)
    t = 1
    while t>0:
        t = c%d #큰수를 작은수로 나눈다.
        c=d # 작은수에 큰수에 대입해주고
        d=t # 나머지 수를 다시 작은수에 넣어준다. 
    answer = int((a*b/c)/b)

    return answer
