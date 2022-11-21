# 주사위의 개수 구하기

def solution(box, n):
    answer = int(box[0]/n)*int(box[1]/n)*int(box[2]/n)
    return answer
