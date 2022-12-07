# 2차원으로 만들기
# 방법1
# num_list가 존재하는 한 계속 while문 돌려서, n개씩 잘라서 붙이기

def solution(num_list, n):
    answer = [] 
    while num_list:
            answer.append(num_list[:n])                  #n개를 잘라서 answer에 붙이기
            num_list=num_list[n:]                        #앞에 잘라서 붙인 n개를 num_list에서 삭제
    return answer
