#공 던지기
def solution(nums,k):
    n = []
    s = 0
    for x in nums*k:
        n.append(x)
    for a in range(1,k):
        s+=2
    answer = n[s]
    return answer
