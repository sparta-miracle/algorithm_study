def solution(ingredient):
    햄버거_수 = 0
    재료 = []
    for i in ingredient:
        재료.append(i)
        if len(재료) >= 4:
            if 재료[len(재료) - 1] == 1 and 재료[len(재료) - 2] == 3 and 재료[len(재료)-3] == 2 and 재료[len(재료)-4] == 1:
                del 재료[len(재료) - 1]
                del 재료[len(재료) - 1]
                del 재료[len(재료) - 1]
                del 재료[len(재료) - 1]
                햄버거_수 += 1
                
            
                
    return 햄버거_수
