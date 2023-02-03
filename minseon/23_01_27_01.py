#약수의 개수와 덧셈

def solution(left, right):
    count = 0
    count2 = []
    answer = 0

    #약수와 약수의 개수 구하기
    for i in range(left,right+1):
        for j in range(1,i+1):
            if i%j == 0:
                count += 1
        #약수의 개수가 짝수인 수는 더하고 홀수인 수는 뺀다.
        if count%2 == 0 :
            answer += i
        else:
            answer-= i
        count = 0

    return answer
