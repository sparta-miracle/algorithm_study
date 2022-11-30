def solution(money):
    answer = []
    커피 = money // 5500
    잔돈 = money % 5500
    answer.append(커피)
    answer.append(잔돈)
    
    return answer
