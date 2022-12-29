# 가위 바위 보

def solution(rsp):
    answer= ''
    rsp=rsp.replace("2","바위").replace("0","보").replace("5","가위")
    answer=rsp.replace("바위","0").replace("보","5").replace("가위","2")
    return answer

# replace를 이용해 숫자로 바로 바꾸는 경우 무한반복이 될 수 있음
# 이기는 경우를 문자로 1차적으로 바꿔준 뒤, 그것을 2차적으로 숫자로 바꿔줌.
