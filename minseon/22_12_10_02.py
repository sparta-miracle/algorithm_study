#OX퀴즈

def solution(quiz):
    answer = []
    for a in quiz:
        x = int(a.split(' ')[0])
        y = int(a.split(' ')[2])
        z = int(a.split(' ')[4])
        if a.split(' ')[1] == '-':
            if x - y == z:
                answer.append("O")
                print(f'answer 1 : {answer}')
            else:
                answer.append("X")
                print(f'answer 2 : {answer}')
        else:
            if x + y == z:
                answer.append("O")
                print(f'answer 3 : {answer}')
            else:
                answer.append("X")
                print(f'answer 4 : {answer}')
    return answer
