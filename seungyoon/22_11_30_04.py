def solution(my_str, n):
    answer = [] * ((len(my_str) // n) + 1)
    
    for i in range(((len(my_str) // n) + 1)):
        answer.append(my_str[0:n])
        my_str = my_str[n:]
        if answer[-1] == "":
            del answer[-1]
    return answer
