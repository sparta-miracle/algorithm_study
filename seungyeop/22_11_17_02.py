삼각형의 완성조건 (1)

def solution(sides):
    sides.sort()
    if sides[0] + sides[1] > sides[2]: # sides.sum() - sides.max() > sides.max()
        return 1
    return 2
