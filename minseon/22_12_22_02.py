# 없는 숫자 더하기


def solution(numbers):
    answer = 0
    num = [0,1, 2, 3, 4, 5, 6, 7, 8, 9]
    for x in num:
        if x not in numbers:
            answer += num[x]
    return answer
