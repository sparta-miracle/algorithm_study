#암호 해독

def solution(cipher, code):
    answer = ''
    for a in range(1,len(cipher)+1):
        if a % code == 0:
            answer+=cipher[a-1]
    return answer

# 문자열의 길이만큼 반복문으로 돌린다.
# if code의 배수 :
    #answer 에 문자열을 인덱스로 찾아서 더한다.
