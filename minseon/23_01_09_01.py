#부족한 금액 계산하기

def solution(price, money, count):
    answer = -1
    inpl = 0
    for a in range(1,count+1):
        inpl += price * a
        print(inpl)
        # 내가 이용한 놀이기구의 가격

        if inpl > money:
            answer = inpl - money
        else:
            answer = 0

    return answer
