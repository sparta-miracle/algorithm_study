# 아이스 아메리카노
# 시도 1
def solution(money):
    int a = money // 5500
    int b = money % 5500
    return [a, b]
# 오류: Traceback (most recent call last):
#   File "/solution_test.py", line 6, in <module>
#     from solution import *
#   File "/solution.py", line 4
#     int a = money // 5500
#         ^
# SyntaxError: invalid syntax
# 해결: a가 오류니까 아예 a를 없애버리자 답안에 바로 입력해볼까

# 시도 2
def solution(money):
    answer = [money // 5500, money % 5500]
    return answer

# 시도 3
def solution(money):
  a = money // 5500
  b = money % 5500
  return [a, b]
# 시도 1에서 'int'를 뺐더니 해결됐다. 다른 언어와 헷갈렸나보다. 각 언어별로 구분해서 기억하자!
