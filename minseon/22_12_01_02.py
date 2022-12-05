#캐릭터의 좌표

def solution(keyinput, board):
    answer = []
    x = 0
    y = 0
    for a in keyinput:
        if (board[0] // 2) * -1 < x:
            if a == "left":
                x -= 1
                print(x, y)
        if x < board[0] // 2:
            if a == "right":
                x += 1
                print(x, y)
        if y < board[1] // 2:
            if a == "up":
                y += 1
                print(x, y)
        if y > (board[1] // 2) * -1:
            if a == "down":
                y -= 1
                print(x, y)
    answer.append(x)
    answer.append(y)
    return answer
