# 문자열 다루기 기본

def solution(s):
    answer = False
    if len(s)== 4 or len(s)==6:
        answer = s.isdigit()
    return answer
