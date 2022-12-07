#콜라츠 추측

def solution(num):
    answer = 0
    if num == 1:
        answer = 0
    elif num > 1:
        while num > 1:
            if num %2 == 0:
                num/=2
                print(f'짝수일 때 num의 값: {num}')
                answer += 1
            else :
                num = (num*3)+1
                print(f'홀수일 때 num의 값: {num}')
                answer += 1
    if answer > 500:
        answer = -1
    return answer
