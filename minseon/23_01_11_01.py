#저주의 숫자 3

def solution(n):
    x = 0
    for a in range(n):
        x += 1
        while (x % 3 == 0 or x % 10 == 3 or x//10 == 3 or x//10 == 13):
            x += 1
        print(f'a:{a} , x:{x}')
    return x
