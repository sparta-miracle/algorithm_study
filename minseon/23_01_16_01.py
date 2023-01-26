#종이 자르기

def solution(m, n):
    answer = 0
    answer += (n-1)*m
    answer += m-1
    return answer
