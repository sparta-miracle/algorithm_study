# 서울에서 김서방 찾기
# seoul의 길이만큼 반복문을 돌려,
# i번째에 "kim"이 있다면 answer에 출력

def solution(seoul):
    k = 0
    for i in range(len(seoul)):
        if "Kim" == seoul[i]:
            k=i
    answer = f'김서방은 {k}에 있다'
    return answer
