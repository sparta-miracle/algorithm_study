# 가장 큰 수 찾기

# 시도 1
def solution(array):
    answer = [max(array), array.index(max(array))]     
    return answer
#  시도 2
def solution(array):
    return [max(array), array.index(max(array))]           # max값과 max의 index를 return한다.
