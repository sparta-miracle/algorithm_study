# 최대공약수와 최소공배수
import math

#
# def solution(n, m):
#     answer = []
#     max = []
#     min = 1
#     max2 = 1
#     print("-----------처음 시작---------------")
#     print(f'max: {max}')
#     print(f'n : {n} , m: {m}')
#     for a in range(1,n+1):
#         while a>1 and n % a == 0 and m % a == 0:
#             max.append(a)
#             n = n//a
#             m = m//a
#             print(f'-----------와일문{a}---------------')
#             print(f'max: {max}')
#             print(f'n : {n} , m: {m}')
#             if a == n:
#                 break
#     print("-----------포문 끝---------------")
#     print(f'max: {max}')
#     print(f'n : {n} , m: {m}')
#
#     for x in max:
#         max2 = max2*x
#         print(f'max2 : {max2}')
#     min = max2*m*n
#     print(f'min : {min}')
#     answer.append(max2)
#     answer.append(min)
#     return answer
#
# print(solution(6, 12))


#유클리드 호제법을 사용한 최대공약수, 최소공배수 구하기
#
def solution(a, b):
    c, d = max(a, b), min(a, b)
    t = 1
    while t > 0:
        t = c % d
        c = d
        d = t
    # 최소 공배수 구하는 공식
    answer = [c, int(a*b/c)]

    return answer

print(solution(6, 12))
#
