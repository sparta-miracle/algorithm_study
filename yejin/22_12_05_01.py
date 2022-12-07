# 유한소수 판별하기
# 시도1 81.3점
def solution(a, b):
    if b%a == 0:               #기약분수로 나누는 식
        b=b/a
    if b%2 == 0 or b%5 == 0:   #소인수 2 또는 5가 있을 때
        answer = 1
    else:
        answer = 2
    return answer
# 문제: 분모에 소인수 2와 5가 1번이라도 있을 경우에 1이 출력되어, 다른 소인수가 끼어 있어도 1이 출력된다. 
# 해결: 반복문을 이용해서 나머지가 0이 될 때까지 계속 2와 5로 나누어지는 경우만 1을 출력해야 한다.

# 시도2 83.3점
def solution(a, b):
    if b%a == 0:                 #기약분수로 나누는 식
        b=b/a
    while (b%2==0 or b%5==0):    #b가 2또는 5로 나누어지면 계속 나누기
        if b%2 == 0:
            b/=2
        if b%5 == 0:   
            b/=5
    if b==1:
        answer =1
    else:
        answer =2
    return answer

#  결론: 좀 더 생각해봐야 함.
