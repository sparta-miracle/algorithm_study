# 캐릭터의 좌표
def solution(keyinput, board):
    r = 0
    u = 0
    for i in keyinput:
        if i == "left":
            r -= 1
        elif i == "right":
            r += 1
        elif i == "up":
            u += 1
        else:
            u -= 1
            
        if r > board[0]//2:
            r = board[0]//2
        elif r < board[0]//2*-1:
            r = board[0]//2*-1
        if u > board[1]//2:
            u = board[1]//2
        elif u < board[1]//2*-1:
            u = board[1]//2*-1  
    return [r, u]
