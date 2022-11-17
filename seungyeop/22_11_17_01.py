# 양꼬치

def solution(n, k):
    k -= n // 10
    answer = n * 12000 + k * 2000
    return answer
