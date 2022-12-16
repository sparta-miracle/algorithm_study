def solution(array):
    answer = [0] * 2
    for i in array:
        if answer[0] == 0:
            answer[0] = i
            answer[1] = array.index(i)
        elif answer[0] < i:
            answer[0] = i
            answer[1] = array.index(i)
    return answer
