def solution(array, height):
    count = 0
    for t in array:
        if height < t:
            count += 1
    return count  # sort, index를 사용하는 방법이 가능 좋은 것으로 보인다.
