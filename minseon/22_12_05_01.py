#유한 소수 판별하기

def solution(a, b):
    answer = 0
    최대공약수 = 0
    # 최대공약수 구하기
    for x in range(1, a + 1):
        if a % x == 0 and b % x == 0:
            최대공약수 = x
    print(f'최대공약수 : {최대공약수}')
    a = a // 최대공약수
    b = b // 최대공약수
    print(f'a:{a}  b:{b}')

    n = b

    # 유한 소수 구하기
    while n % 2 == 0:
        n = n // 2
        print(f'2로 나눈 n: {n}')
    while n % 5 == 0:
        n = n // 5
        print(f'5로 나눈 n: {n}')

    if n == 1:
        answer = 1
    else:
        answer = 2

    print(f'answer 의 값 : {answer}')
    return answer
