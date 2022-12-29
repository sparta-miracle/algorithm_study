# 행렬의 덧셈

# 시도1
def solution(arr1, arr2):
    answer =[]
    for i in range(len(arr1)):
        for j in range(len(arr1[0])):
            arr1[i][j]+=arr2[i][j]
            answer.append(arr1[i][j])
    return answer
# 문제: 실행한 결괏값 [4,6,7,9]이 기댓값 [[4,6],[7,9]]과 다릅니다.
# 해결: 이중배열로 만들기

# 시도2
def solution(arr1, arr2):
    answer =[]
    for i in range(len(arr1)):
        a = []
        for j in range(len(arr1[0])):
            a.append(arr1[i][j]+arr2[i][j])
        answer.append(a)
    return answer

# arr1의 길이만큼 반복문을 돌려줌.
# 이중 반복문을 만들어 열의 길이만큼 돌려주며 값을 더해줌.
# 더한 값을 a에 붙여넣어주고 열이 다 돌아가면 answer에 붙여줌.
# 이중배열을 만들어 return해줌.
