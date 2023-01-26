def solution(k, m, score):
    score.sort(reverse=True)
    A = 0
    B = [] * m
    for i in score:
        B.append(i)
        if len(B) == m:
            A += min(B) * len(B)
            B = [] * m
    return A
