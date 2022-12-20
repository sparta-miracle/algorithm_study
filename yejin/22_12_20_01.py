# 다음에 올 숫자

def solution(common):
    answer = 0   
    if common[1]-common[0]==common[2]-common[1]:           #등차수열일 때,
        d= common[1]-common[0]                             #공차
        answer= common[-1]+d                               #마지막 항 +공차
    elif common[1]/common[0]==common[2]/common[1]:         #등비수열일 때,
        t= common[1]/common[0]                             #공비
        answer=common[-1]*t                                #마지막 항 *공비
        
    return answer
