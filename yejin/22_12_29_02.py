# K번째수

def solution(array, commands):
    answer,z = [], []
    for a in range(len(commands)):
        i,j,k = commands[a][0]-1, commands[a][1], commands[a][2]-1
        z = array[i:j]
        z= sorted(z)
        answer.append(z[k])
    return answer

# commands의 길이만큼 반복문 돌리기
# commands의 원소하나씩 뽑아내서 i,j,k 부여
# z라는 배열에 i부터 j까지 슬라이싱하고, 정렬한 뒤, k번째 수 구하기
# 구한 수를 answer 배열에 추가하기.
# +) 인덱스는 0부터 시작한다는 규칙을 따라서, i와 k는 -1 해주기.
