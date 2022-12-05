#홀수 짝수 개수

def solution(num_list):
    answer = []
    홀수 = []
    짝수 = []
    for x in num_list:
        if x%2 == 1 :
            홀수.append(x)
        else:
            짝수.append(x)

    print(len(홀수))
    print(len(짝수))
    answer=[len(짝수),len(홀수)]
    print(answer)
    return answer
