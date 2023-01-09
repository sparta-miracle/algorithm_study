#핸드폰 번호 가리기

def solution(phone_number):
    answer = ''
    a=''
    for x in phone_number[:-4]:
        a+='*'
    b = phone_number[-4:]
    answer = a+b
    return answer
