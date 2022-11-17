# 양꼬치
def solution(n, k):
    answer = 0
    answer = n * 12000 + k * 2000
    if int(n / 10) >= 1:
        answer -= int(n / 10) * 2000
    
    return answer
