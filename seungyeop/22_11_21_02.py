def solution(box, n):
    total = 1
    for i in range(3):
        total *= box[i] // n
    return total
