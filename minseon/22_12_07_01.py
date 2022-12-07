# 연속된 수의 합

#1차시도

def solution(num, total):
    answer = []
    middlenum = total//num
    if num%2 == 0:
        middlenum2 = middlenum+1
        answer.append(middlenum)
        answer.append(middlenum2)
        min = middlenum - 1
        max = middlenum2 + 1
        answer.append(min)
        answer.append(max)

        print(f'배열의 합:{sum(answer)}')
        #for문을 돌리던가 while문을 돌려서 배열의 합이 total과 같아질 때 까지 max에 +1씩 하고..min에 -1씩 하면 될 것 같은데..
        while sum(answer) < total :
            min -=1
            max += 1
            answer.append(min)
            answer.append(max)
            print(f'num이 짝수일 때 min의 값 : {min} , num이 짝수일 때 max의 값 : {max}')
        answer.sort()
        print(f'짝수일때 answer : {answer}')
    else:
        answer.append(middlenum)
        min = middlenum - 1
        max = middlenum + 1
        answer.append(min)
        answer.append(max)

        print(f'배열의 합:{sum(answer)}')
        while sum(answer) < total :
            min -= 1
            max += 1
            answer.append(min)
            answer.append(max)
            print(f'num이 짝수일 때 min의 값 : {min} , num이 짝수일 때 max의 값 : {max}')
        answer.sort()
        print(f'홀수일때 answer : {answer}')

    return answer
    
    #실패..!
