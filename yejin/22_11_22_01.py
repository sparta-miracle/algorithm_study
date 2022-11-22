#편지
# 방법 1
# len함수로 문자열 길이 구하기
def solution(message):
    return len(message)*2

# 방법 2
# 반복문과 변수 만들어 문자열 길이 구하기
def solution(message):
    length = 0
    for i in message:
        length += 1
    return length*2
