# 두 정수 사이의 합

def solution(a, b):
    answer = 0
    if a==b:                       # a==b 일 때, a 리턴
        answer=a
    elif a>b:                      # a>b 일 때, b~a의 합 리턴
        for i in range(b,a+1):
            answer+=i        
    elif b>a:                      # b>a 일 때, a~b의 합 리턴
        for i in range(a,b+1):
            answer+=i   
    return answer
