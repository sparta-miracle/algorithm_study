# 없는 숫자 더하기

# 시도1
def solution(numbers):
    answer = 0
    a= [0,1,2,3,4,5,6,7,8,9]
    for i in a:
        if i not in numbers:
            answer+= i
    return answer

# 시도2
def solution(numbers):
    a= [0,1,2,3,4,5,6,7,8,9]
    return sum(i for i in a if i not in numbers)
