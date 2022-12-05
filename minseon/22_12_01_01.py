#개미군단
def solution(hp):
    a = hp//5
    hp%=5
    b = hp//3
    hp%=3
    c= hp//1
    answer = a+b+c
    return answer
