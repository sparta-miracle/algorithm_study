#삼각형의 완성조건 (1)

def solution(sides):
    answer = 0
    max_1 = int(max(sides))
    a,b,c = map(int,sides)
    if a == max_1:
        if b+c > a:
            answer = 1
        else:
            answer = 2
    elif b == max_1:
        if a+c > b:
            answer = 1
        else:
            answer = 2
    else:
        if a+b > c:
            answer = 1
        else:
            answer = 2
    return answer
