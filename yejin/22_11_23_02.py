# 머쓱이보다 키 큰 사람
# 방법 1 sort로 내림차순으로 정렬한 뒤 height보다 작은 사람의 인덱스를 구한다. return값은 인덱스값이 키 큰 사람 수이다.(인덱스는 0부터 시작하니까) 
# 문제: 키가 같은 사람인 경우 예외처리를 해야한다.
# 1) 키가 같은 사람이 2명 이상일 경우 인덱스는 어떻게 구하지?
# 2) 키가 작은 사람의 인덱스를 구하고 같은 사람의 수를 구해서 인덱스의 값에서 빼야하나?

# 방법 2 compare로 height와 비교해 height보다 큰 수를 포함한 리스트를 만든다. 그 리스트의 길이를 return한다.

# 방법 3 빈 리스트를 만들어, for문과 if문으로 height보다 큰 수를 넣어준 뒤 리스트의 길이를 구한다.

def solution(array, height):
    a=[]
    for i in array:
        if i > height:
            a.append(i)
    return len(a)
