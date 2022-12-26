def solution(seoul):
    position = 0
    for i in seoul:
        if i == "Kim":
            return f'김서방은 {position}에 있다'
        else:
            position += 1
            
