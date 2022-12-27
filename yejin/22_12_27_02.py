# 나누어 떨어지는 숫자 배열

# 방법1
# 오름차순으로 배열 정렬
# 반복문을 돌려 arr의 원소가 divisor로 나눠떨어지는 경우 answer에 추가.
# "if not 배열" 배열이 존재하지 않을 경우 -1 리턴

# 시도1
# 테스트 6 〉	통과 (22.01ms, 13.8MB)
def solution(arr, divisor):
    answer = []
    for i in sorted(arr):
        if i%divisor==0:
            answer.append(i)       
    if not answer:
        answer.append(-1)
    return answer
# 개선: 반복문에 정렬하면, 반복문 돌릴때마다 정렬되기 때문에 시간이 오래걸림
# 해결: return에서 정렬해주자!

# 시도2
# 테스트 6 〉	통과 (3.25ms, 13.3MB)
def solution(arr, divisor):
    answer = []
    for i in arr:
        if i%divisor==0:
            answer.append(i)       
    if not answer:
        answer.append(-1)
    return sorted(answer)
