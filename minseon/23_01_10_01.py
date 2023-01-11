#내적

def solution(a, b):
    answer = 0
    for x in range(len(a)):
        answer+=a[x]*b[x]
    return answer
