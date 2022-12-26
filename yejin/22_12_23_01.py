# x만큼 간격이 있는 n개의 숫자

def solution(x, n):
    answer = []
    l = x*n
    for i in range(x,l+x,x):
            answer.append(i)
    return answer
  
 # l은 answer의 마지막 수
# 반복문과 range를 이용해, x부터 l까지 x씩 증가하는 숫자를 배열 answer에 넣는다.
# 문제: 테스트8 런타임 에러 / 정확성 92.9
# 해결: 0을 곱하거나 누눌 수 없기 때문에 문제가 발생하였다. 1부터 시작해보자.

def solution(x, n):
    answer = []
    for i in range(1,n+1):
            answer.append(i*x)
    return answer
