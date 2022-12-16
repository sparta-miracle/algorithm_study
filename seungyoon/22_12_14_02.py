def solution(dots):
    # 평행이 되는 경우 -> 기울기가 같아야 함
    # 기울기 = X축의 증가 or 감소 값 / Y축의 증가 or 감소 값
    
    # X축의 값 구하기
    X축 = []
    for i in range(len(dots)):
        if i + 1 < len(dots):
            A = dots[i][0] - dots[i + 1][0]
            X축.append(A)
        if i + 2 < len(dots):
            B = dots[i][0] - dots[i + 2][0]
            X축.append(B)
        if i + 3 < len(dots):
            C = dots[i][0] - dots[i + 3][0]
            X축.append(C)
            
    # Y축의 값 구하기
    Y축 = []
    for i in range(len(dots)):
        if i + 1 < len(dots):
            A = dots[i][1] - dots[i + 1][1]
            Y축.append(A)
        if i + 2 < len(dots):
            B = dots[i][1] - dots[i + 2][1]
            Y축.append(B)
        if i + 3 < len(dots):
            C = dots[i][1] - dots[i + 3][1]
            Y축.append(C)
    
    # 기울기 구하기
    for i in range(len(X축)):
        print(Y축[i] / X축[i])
        if i + 1 < len(X축):
            if Y축[i] / X축[i] == Y축[i + 1] / X축[i + 1]:
                return 1
        if i + 2 < len(X축):
            if Y축[i] / X축[i] == Y축[i + 2] / X축[i + 2]:
                return 1
        if i + 3 < len(X축):
            if Y축[i] / X축[i] == Y축[i + 3] / X축[i + 3]:
                return 1
        if i + 4 < len(X축):
            if Y축[i] / X축[i] == Y축[i + 4] / X축[i + 4]:
                return 1
        if i + 5 < len(X축):
            if Y축[i] / X축[i] == Y축[i + 5] / X축[i + 5]:
                return 1
        
    return 0
