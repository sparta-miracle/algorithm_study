#문자열 다루기 기본


def solution(s):
    answer = True
    arr=["1","2","3","4","5","6","7","8","9","0"]
    if len(s)==4 or len(s)==6 :
        for x in s:
            if x not in arr :
                answer = False
                break
            else:
                answer = True
    else:
        answer = False
    return answer
