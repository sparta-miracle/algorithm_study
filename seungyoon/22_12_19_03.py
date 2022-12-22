def solution(phone_number):
    answer = ''
    for i in range(len(phone_number)):
        if (len(phone_number) - 4) > i:
            answer += "*"
        else:
            answer += phone_number[i]      
    return answer
