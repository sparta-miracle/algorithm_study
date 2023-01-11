#문자열 내 p와 y의 개수

def solution(s):
    p_count = 0
    y_count = 0
    # s 글자 다 대문자로 바꿔서 s에 넣어주기
    s = s.upper()
    
    #s인덱스로 돌면서 알파벳 비교 후 카운트 세주기
    for i in range(len(s)):
        if s[i]=="P":
            p_count += 1
        elif s[i] == "Y":
            y_count += 1

    #p랑 y 개수 같은지 비교하기
    if p_count == y_count:
        answer = True
    else:
        answer = False

    return answer
