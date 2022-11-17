#삼각형의 완성조건 (1)
def solution(sides):
    sides.sort()
    if sides[-1] < sum(sides) - sides[-1]:
        answer = 1
    else:
        answer = 2
    return answer
# def find maxnum(sides):
#         maxnum = sides[0]
#         for num in sides:
#             if num > maxnum:
#                 maxnum = num
# def solution(sides):
#     if maxnum < sum(sides) - maxnum:
#         answer = 1
#     else:
#         answer = 2
#     return answer
