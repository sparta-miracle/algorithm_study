#3진법 뒤집기

def solution(n):
    answer = 0
    t = []
    if n <= 3:
        t.append(n)
    while n//3 >= 1:
        t.append(n%3)
        n = n // 3
        if n < 3 :
            t.append(n)
    t.reverse()
    print(t)
    for index , a in enumerate(t):
        print(f'index , a : {index},{a}')
        answer += a*3**index
    return answer

print(solution(1))
