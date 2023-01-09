# 분수의 덧셈

def solution(denum1, num1, denum2, num2):
    answer = [0 for i in range(2)]
    # 통분하고 더하기
    denum3 = (denum1 * num2) + (denum2 * num1)
    num3 = num1 * num2

    # 기약분수 구하기
    for x in range(1 , denum3+1) :
        if num3 % x == 0 and denum3 % x ==0 :
            answer[0] = denum3//x
            answer[1] = num3//x

    return answer
