# 분수의 덧셈
def solution(denum1, num1, denum2, num2):
    answer = []
    denum,num = 0,0
    if num1!=num2:
        num=num1*num2
        denum= (denum1*num2)+(denum2*num1)

# 기약분수 만들기
    for i in range(1,num+1):
        if denum%i==0 and num%i==0:
            denum/=i
            num/=i
            i=1
    
    
    answer.append(denum)
    answer.append(num)
    return answer

  #실패,,
