#문자 반복 출력하기

def solution(my_string, n):
    answer = ''
    for a in my_string:
        answer += str(a*n)
    return answer
