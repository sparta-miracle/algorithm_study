# 머쓱이보다 키 큰 사람
# 방법 1 sort로 내림차순으로 정렬한 뒤 height보다 작은 사람의 인덱스를 구한다. return값은 인덱스 -1해서 키 큰 사람 수를 구한다.
# 방법 2 compare로 height와 비교해 height보다 큰 수를 포함한 리스트를 만든다. 그 리스트의 길이를 return한다.
# 방법 3 빈 리스트를 만들어, for문과 if문으로 height보다 큰 수를 넣어준 뒤 리스트의 길이를 구한다.

def solution(array, height):
    a=[]
    for i in array:
        if i > height:
            a.append(i)
    return len(a)
