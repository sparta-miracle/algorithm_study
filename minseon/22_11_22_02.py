#자릿수 더하기
def solution(n):
    a = str(n)
    answer = 0
    for i in a:
        answer += int(i)
    return answer
