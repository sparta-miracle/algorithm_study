def solution(hp):
    장군개미 = 5
    병정개미 = 3
    일개미 = 1
    
    
    장군개미_수 = hp // 장군개미
    A = hp % 장군개미
    병정개미_수 = A // 병정개미
    B = A % 병정개미
    일개미_수 = B // 일개미
    
    answer = 장군개미_수 + 병정개미_수 + 일개미_수
    return answer
