# 배열 회전시키기

# 방법1
# right일 경우, numbers[-1]+numbers[:-1]
# left일 경우, numbers[1:]+numbers[0]
# 시도1
def solution(numbers, direction):
    answer= []
    if direction == "right":
        answer.append(numbers[-1])
        answer.extend(numbers[:-1])
    else:
        answer.extend(numbers[1:])
        answer.append(numbers[0])  
    return answer

# 시도2
# 슬라이싱한 것 => 배열 // 인덱스는 낱개(배열로 만들어주기)
# 파이썬에서는 "+"를 사용하여 배열들을 합칠 수 있다.
def solution(numbers,direction):
    if direction == "right":
        return [numbers[-1]]+numbers[:-1]
    else:
        return numbers[1:]+[numbers[0]]
    
# 시도3
def solution(numbers,direction):
    return [numbers[-1]]+numbers[:-1] if direction == "right" else numbers[1:]+[numbers[0]]
