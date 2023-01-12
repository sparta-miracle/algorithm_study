# 수박수박수박수박수박수?

def solution(n):
    melon = "수박"
    answer = ''
    if n%2 == 0 :
        answer = melon*(n//2)
    else:
        answer = melon*(n//2)+"수"
    return answer

print(solution(3))
