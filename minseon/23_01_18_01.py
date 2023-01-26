#과일 장수


def solution(number):
    count = 0
    for i in range(len(number)):
        for x in range(1,len(number)):
            for z in range(1,len(number)):
                if number[i]+number[x]+number[z] == 0 :
                    count+=1

    print(count)
    answer = round(count/len(number))
    print(answer)
    return answer
