# 예산

def solution(d, budget):
    answer = 0
    sum = 0

    d.sort()

    for i in range(len(d)):
        if sum <= budget:
            sum += d[i]
            if sum <= budget:
                answer += 1

        else:
            break
    return answer
