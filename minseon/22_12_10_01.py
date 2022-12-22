#k의 개수

def solution(i, j, k):
    answer = 0
    sum = ''
    for x in range(i,j+1):
        sum += str(x)
    for y in sum :
        if y == str(k) :
            answer+=1
    return answer
