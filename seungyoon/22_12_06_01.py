def solution(num):
    count = 0
    while (count < 500):
        if num == 1:
            return count
        
        elif num % 2 == 0:
            num /= 2
            count += 1
            
        elif num % 2 != 0:
            num *= 3
            num += 1
            count += 1
    return -1
