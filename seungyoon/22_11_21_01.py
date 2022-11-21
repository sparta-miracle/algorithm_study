def solution(box, n):
    answer = 1
    # 곱해야하니까 0이면 안됨.
    
    for i in range(len(box)):
        answer *= box[i] // n
        
    # 각 모서리에 넣을 수 있는 주사위의 최대 개수 = box[i] // n
    # 상자에 들어갈 수 있는 주사위의 최대 수  = 가로, 세로, 높이의 주사위 최대 개수를 곱한 값
    return answer
