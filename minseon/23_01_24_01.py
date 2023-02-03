#명예의 전당 (1)


def solution(k, score):
    fame = []
    answer = []

    for i in range(len(score)):
        if i < k:
            fame.append(score[i])
            answer.append(min(fame))
        elif i >= k:
            if score[i] > min(fame) :
                min_index = fame.index(min(fame))
                fame[min_index] = score[i]
                answer.append(min(fame))
            else:
                answer.append(min(fame))
    return answer
