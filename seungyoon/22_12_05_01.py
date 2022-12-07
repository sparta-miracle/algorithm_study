def solution(a, b):
    for i in range(min(a, b),0, -1):
        if a % i == 0 and b % i == 0:
            최대공약수 = i
            break
    print(a/ 최대공약수)
    return 0
