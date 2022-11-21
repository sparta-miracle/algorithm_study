def solution(s):
    s_split = s.split(" ")
    # 공백을 기준으로 문자열을 나누고, 각각의 인덱스를 가지게 됨. 
    # ["a", "b", "c"] 
    
    s_compare = list(map(int, s_split))
    # 위에서 나눈 문자열을 정수형으로 바꿔서 새로운 리스트를 만듦.
    
    answer = "{} {}".format(min(s_compare), max(s_compare))
    # 정수형으로 바뀐 문자열에서 최솟값과 최댓값 구해서 다시 문자열로 반환.
    # 문자열 사이에 문자열 넣기
    
    return answer

# 또 다른 방법, for문을 돌려서 s_split을 새로운 리스트에 int(s_split)로 추가해서 비교.

# map이 반복문을 쓰는 것 보다는 더 효율적??
