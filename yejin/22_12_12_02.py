# OX퀴즈

# (방법1) "="을 기준으로 수식과 답 두 덩이로 나누어, 이를 비교해 "O", "X"를 출력하게 만들고 싶지만 어떻게 해야할지 감이 오지 않는다. 
# 그러니 (방법2) 공백을 기준으로 나누고 인덱스로 하나하나 비교해보자.

# 시도 1
def solution(quiz):
    answer = []
    for i in quiz:
        if i.split(" ")[1] == "-":
            if int(i.split(" ")[4]) == int(i.split(" ")[0]) - int(i.split(" ")[2]):
                answer.append("O")
            else:
                answer.append("X")
        else:
            if int(i.split(" ")[4]) == int(i.split(" ")[0]) + int(i.split(" ")[2]):
                answer.append("O")
            else:
                answer.append("X")
    return answer
# 문제: .split을 할때 " "라고 하지 않고, ""라고 해서 값이 이상해진 것이다.
# 기본적인 실수를 자제하자....
# 개선: 반복되는 i.split("")를 변수로 지정해서 간소화 하자.

# 시도 2
def solution(quiz):
    answer = []
    for i in quiz: 
        a = i.split(" ")                              # 공백을 기준으로 문자열을 나눔
        if a[1] == "-":                               # 연산자가 마이너스 일때
            if int(a[4]) == int(a[0]) - int(a[2]):    
                answer.append("O")
            else:
                answer.append("X")
        else:                                         # 연산자가 플러스 일때
            if int(a[4]) == int(a[0]) + int(a[2]):
                answer.append("O")
            else:
                answer.append("X")
    return answer
# 개선: "X"를 넣어주는 줄이 두 번 반복되니 줄여주자. 첫번째 if문과 줄맞춰 "X"를 붙여주고
# 두번째, 세번째 if문 밑에 continue를 써주자.

# 시도 3
def solution(quiz):
    answer = []
    for i in quiz: 
        a = i.split(" ")                              # 공백을 기준으로 문자열을 나눔
        if a[1] == "-":                               # 연산자가 마이너스 일때
            if int(a[4]) == int(a[0]) - int(a[2]):    
                answer.append("O")
                continue
        else:                                         # 연산자가 플러스 일때
            if int(a[4]) == int(a[0]) + int(a[2]):
                answer.append("O")
                continue
        answer.append("X")
    return answer

# 시도 4
def solution(quiz):
    answer = []
    for i in quiz:
        a, b = quiz.split("=")[0].split(" "), quiz.split("=")[1].split(" ")
        if int(b) == int(a[0]) + int(a[1]) + int(a[2]):
            answer.append("O")
            continue
        else:
            answer.append("X")
    return answer
    
# 의문: quiz.split("=").split(" ") 이렇게 나누면 어떻게 되지?
# 1) a = quiz.split("=")[0].split(" ")
# a[0]= X, a[1]= 연산자, a[2]= Y
# 2) a = quiz.split("=").split(" ")
# a[0]= X, a[1]= 연산자, a[2]= Y, a[3]= Z 로 나눠지는 건가?
    
