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
