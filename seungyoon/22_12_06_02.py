def solution(numbers, k):
    # 던지는_사람의_인덱스_위치 = 2 * (k - 1)               # 한바퀴 돌아야 할 경우
    던지는_사람 = 2 * (k - 1) % len(numbers)
    return numbers[던지는_사람]
    

    
        
