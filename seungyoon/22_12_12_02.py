def solution(quiz):

    answer = [] * len(quiz)
    for i in range(len(quiz)):
        X = int((quiz[i].split())[0])  
        Y = int((quiz[i].split())[2]) 
        Z = int((quiz[i].split())[4])
        연산자 = quiz[i].split()[1]
        if 연산자 == "+":
            if X + Y == Z:
                answer.append("O")
            else:
                answer.append("X")
        elif 연산자 == "-":
            if X - Y == Z:
                answer.append("O")
            else:
                answer.append("X")
            
    return answer
