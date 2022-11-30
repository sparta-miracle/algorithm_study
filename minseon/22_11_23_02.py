#머쓱이보다 키 큰 사람

def solution(array, height):
    answer = 0
    for a in array:
        if a > height:
            answer += 1
    return answer

#내가 생각한 과정
#몇번째로 서야 하는지 궁금해 졌다고 했으니까 머쓱이보다 작은 사람을 찾아야겠다고 생각을 했다.
#배열을 돌려서 하나씩 머쓱이의 키와 비교해준뒤
#머쓱이보다 작은 키가 나타나면 하나씩 더해주면 될 것 같다.
