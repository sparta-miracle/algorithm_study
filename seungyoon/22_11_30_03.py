from string import ascii_lowercase

def solution(age):
    answer = ""
    alphabet_list = list(ascii_lowercase)
    A = list(map(int,list(str(age))))
    for i in A:
        answer +=alphabet_list[i]
    
    
    return answer
