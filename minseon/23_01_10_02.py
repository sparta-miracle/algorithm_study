#나머지가 1이 되는 수 찾기

def solution(n):
    answer = 0
    for x in range(2,n+1):
        if n % x == 1 :
            return x
    return answer
