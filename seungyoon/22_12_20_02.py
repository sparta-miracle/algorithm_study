def solution(a, b):
    if a == b:
        return a
    ints = (a, b)
    return sum([i for i in range(min(ints), max(ints)+1)])
