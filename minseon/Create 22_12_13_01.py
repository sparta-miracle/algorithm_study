#짝수의 합


def solution(n):
    sum = 0
    for x in range(1,n+1):
        if x % 2 == 0:
            sum += x
    return sum
