# 공 던지기 => 실패
# numbers의 길이와 index를 이용해 어떻게든 해볼 수 있을 것 같다
# numbers의 길이를 넘어가면 배열의 처음부터 세는? if문을 만들어야 한다
# ex) numbers[-2] => numbers[0], numbers[-1] => numbers[1]

def solution(numbers, k):
    a = 0 #??
    b = 0
    while(k!=0):
        if b == numbers[-2]:
            b = numbers[0]
            k-=1
        elif b == numbers[-1]:
            b = numbers[1]
            k-=1
        b= numbers[a]
        a+=2
        k-=1 
        
    return b

#다른  방법을 생각해보자.
