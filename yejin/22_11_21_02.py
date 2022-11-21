# 최댓값과 최솟값

# 방법 1 정렬 후 인덱스로 구하기
# 시도 1
# def solution(s):
#     int(s())
#     s.sort()
#     return s[-1] and s[0]

# 문제: TypeError: 'str' object is not callable
# 해결: int()쓰면 되는거 아님?, map함수를 써보자

# 시도 2
# def solution(s):
#     int_list = list(map(int, s))
#     int_list.sort()
#     return s[-1] and s[0]

# 문제: ValueError: invalid literal for int() with base 10: ' '
# 해결: 공백 제거 필요?

# 시도 3
#  def solution(s):
#     int_list = list(map(int, s))
#     if ' ' in s:
#         s.replace(' ','')
#     int_list.sort()
#     return s[-1] and s[0]

# 문제: Traceback (most recent call last):
#   File "/solution_test.py", line 6, in <module>
#     from solution import *
#   File "/solution.py", line 22
#     def solution(s):
#     ^
# IndentationError: unexpected indent

# 방법 2 최솟값, 최댓값 함수로 구하기
def solution(s):
    map(int, s)
    # s.split(' ')
    min = s[0]
    for a in int(s):
        if a < min:
            min = a
    max = s[0]
    for b in int(s):
        if b > max:
            max = b
    return str(min, max)
# 문제: ValueError: invalid literal for int() with base 10: '-1 -1'
            
