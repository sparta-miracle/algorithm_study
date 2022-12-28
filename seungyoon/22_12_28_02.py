def solution(ingredient):
    햄버거_수 = 0
    재료 = [] * 3
    for i in ingredient:
        if len(재료) < 3:
            재료.append(i)
        else:
            if 재료[0] == 1 and 재료[1] == 2 and 재료[2] == 3 and i == 1:
                햄버거_수 += 1
            else:
                재료[0] = 재료[1]
                재료[1] = 재료[2]
                재료[2] = i
                
    return 햄버거_수
