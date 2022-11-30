#외계행성의 나이
def solution(age):
    answer = ''
    a = str(age)
    age_list = {0:'a' , 1:'b', 2:'c', 3:'d', 4:'e', 5:'f', 6:'g', 7:'h', 8:'i', 9:'j' }
    for i in range(len(a)):
        answer += age_list.get(int(a[i]))
    return answer
