def solution(n, k):
    Free_drink = n // 10 
    return (n * 12000) + (k * 2000) - (Free_drink * 2000)
