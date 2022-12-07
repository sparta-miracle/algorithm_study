def solution(num, total):
    average = total // num  #연속된 수이기 때문에 평균을 기준으로 좌측, 우측 끝 값만 구하면 된다고 함..
    return [i for i in range(average - (num - 1) // 2, average + (num + 2) // 2)]
# for 앞에 i는 뭐지? -> 리스트 컴프리헨션: List 내에 for문 선언하기
# https://redmuffler.tistory.com/452
# 내가 시도했을 때는 평균을 이용할 생각을 못하고, 좌측 우측 끝값과 그 다음 좌측 우측 끝값을 비교했었다. (같으면 연속된 수)


# num = 5, total = 5 일 때
# average = 1
# range(-1, 3)
# return 값은 [-1, 0, 1, 2, 3]


    '''
    answer = [] * num
    범위 = list(range(-total, total + 1))
    print(범위)
    i = 0
    k = 0
    total_값 = 0
    while i < len(범위):
        if k < num:
            total_값 += 범위[i]
            k += 1
        else:
            if total_값 == total:
                break
            elif total_값 != total:
                k = 0
                i = 1
        i += 1
    
    return total_값
    '''
