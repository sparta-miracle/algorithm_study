# k의 개수

# 시도 1
# def solution(i, j, k):
#     answer = 0
#     for a in range(i,j+1):                    
#         if str(k) in str(a):                   
#             answer += 1    
#         else:
#             continue    
#     return answer
# 문제: 1은 11에 두 번 들어간다. 하지만 이 경우에도 count는 1만 되므로 답이 아니다.
# 해결: count를 이용해서 k가 들어간 개수만큼 카운트해줘야 한다.

# 시도 2
def solution(i, j, k):
    answer = 0
    for a in range(i,j+1):                     # i부터 j+1까지 반복문
        if str(k) in str(a):                   # 해당 수에 k가 있다면,
            answer += str(a).count(str(k))     # a에서 k의 개수를 카운트해준다.
        else:
            continue    
    return answer
