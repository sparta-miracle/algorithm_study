#다음에 올 숫자

def solution(common):
    answer = 0
    a = common[1] - common[0]
    b = common[2] - common[1]
    if (a != b):
        c = common[1]//common[0]
        answer = common[len(common)-1] * c
        # print(max(common))
    else:
        answer = common[len(common)-1] + a
    # common[0]과 common[1]의 차이를 구하고
    # common[1] 과 common[2] 가 같으면 등차수열 다르면 등비수열이다.
    return answer
