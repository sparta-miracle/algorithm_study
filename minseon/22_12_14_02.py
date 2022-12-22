#평행

def solution(dots):
    answer = 0
    dots.sort()
    print(dots)
    a = dots[1][0]-dots[0][0] #x축 끼리의 차이 구하기
    b = dots[1][1]-dots[0][1] #y축 끼리의 차이 구하기

    c = dots[3][0] - dots[2][0] # x축 끼리의 차이 구하기
    d = dots[3][1] - dots[2][1] #y축 끼리의 차이 구하기

    print(f'a:{a} b: {b} c:{c} d:{d}')

    if dots[1][0]==dots[0][0]==dots[3][0]==dots[2][0] or dots[1][1]==dots[0][1]==dots[3][1]==dots[2][1]:
        answer = 1
    elif a == c and b == d:
        answer = 1
    else:
        answer = 0
    return answer
