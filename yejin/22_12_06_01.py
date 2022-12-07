# 콜라츠 추측
def solution(num):
    answer, count, a = 0, 0, num
    if a == 1:                          #num이 애초에 1일 경우 0 출력
        answer = 0
    while(num!=1):                      #다음 작업을 num이 1이 될 때까지 반복
        if num%2==0:                        #짝수일 경우 2로 나누기
            num/=2
            count +=1
        else:
            num=num*3+1                     #홀수일 경우 3 곱하고 1 더하기
            count +=1    
        answer = count
    # if num==1:                        #num이 1이 될 경우 작업의 반복 횟수 출력
    #     answer = count
    if count > 499:                     #작업의 반복이 500번 이상일 경우 -1 출력
        answer = -1
    return answer
