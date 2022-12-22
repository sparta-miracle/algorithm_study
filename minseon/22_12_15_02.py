#문자열 내 마음대로 정렬하기

def solution(strings, n):
    a = []
    answer = []
    for x in strings:
        a.append(x[n] + x)
        sorted_str = sorted(a)
        print(sorted_str)
    for y in sorted_str:
        answer.append(y[1:])


    return answer
