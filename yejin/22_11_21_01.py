# 주사위의 개수
def solution(box, n):
    answer = (box[0]//n)*(box[1]//n)*(box[2]//n)
    return answer
