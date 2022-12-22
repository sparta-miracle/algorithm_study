#가장 큰 수 찾기
def solution(array):
    answer = []
    a=max(array)
    answer.append(a)
    answer.append(array.index(a))
    return answer
