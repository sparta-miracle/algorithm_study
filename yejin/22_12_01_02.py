# 캐릭터의 좌표
def solution(keyinput, board):
    r = 0
    u = 0
# 가로측 좌표 r과 세로측 좌표 u를 정한다.
    for i in keyinput:
        if i == "left":
            r -= 1
        elif i == "right":
            r += 1
        elif i == "up":
            u += 1
        else:
            u -= 1
# board 값을 통해 좌표의 증가 범위를 제한해준다.
        if r > board[0]//2:
            r = board[0]//2
        elif r < board[0]//2*-1:
            r = board[0]//2*-1
        if u > board[1]//2:
            u = board[1]//2
        elif u < board[1]//2*-1:
            u = board[1]//2*-1  
    return [r, u]
