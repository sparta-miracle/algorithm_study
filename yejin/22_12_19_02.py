# 핸드폰 번호 가리기
def solution(phone_number):
    answer = ''
    for i in range(len(phone_number)):
        if i < len(phone_number)-4:
            answer+="*"
    phone_number=phone_number[-4:]
    answer+=phone_number
    return answer

# 생각1
# 인덱스 -4보다 전이면, replac를 이용해 *로 바꿔주기
# 문자열>배열로 바꾸기, 배열 인덱스 이용해서 *로 바꾸기
# 다시 문자열로?
# => 비합리적, 다른 방법을 생각하자.

# 다른 방법
#슬라이싱하기
#for문 반복하고 i가 len-4일때
#정규식 이용
