# 점의 위치 구하기
# 시도1
def solution(dot):
    if dot[0]>0:           # x좌표가 양수
        if dot[1]>0:       # 1) y좌표가 양수
            return 1
        else:              # 2) y좌표가 음수
            return 4
    else:                  # x좌표가 음수
        if dot[1]>0:       # 1) y좌표가 양수
            return 2
        else:              # 2) y좌표가 음수
            return 3

# 시도2
def solution(dot):
    if dot[0]*dot[1] > 0:
        return 1 if dot[0]>0 else 3
    else:
        return 2 if dot[0]<0 else 4
    
# 시도3
def solution(dot):
    if dot[0]>0:
        return 1 if dot[1]>0 else 4
    else:
        return 2 if dot[1]>0 else 3
