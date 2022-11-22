# 자릿수 더하기
# 시도1
# def solution(n):
#     for i in n:
#         answer+=i
# return answer

# 시도2
# def solution(n):
#     n = str(n)
#     answer = 0
#     for i in n:
#         answer += int(i)
#     return answer
# 문제: Traceback (most recent call last):
#   File "/solution_test.py", line 6, in <module>
#     from solution import *
#   File "/solution.py", line 15
#     return answer
#     ^
# SyntaxError: 'return' outside function

# 시도3
def solution(n):
    a = str(n)
    answer = 0
    for i in a:
        answer += int(i)
    return answer
