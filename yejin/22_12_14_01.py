# 암호 해독
def solution(cipher, code):
    answer = ''
    a=code-1
    for i in cipher:
        if i == cipher[a]:
            answer += i
            a += code
            if a>len(cipher)-1:
                break
    return answer
