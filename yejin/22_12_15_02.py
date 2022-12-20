# 문자열 내 마음대로 정렬하기
# 방법1
# 새 리스트 a: strings 리스트 원소의 n번째 알파벳을 추가후 정렬
# 반복문을 돌려 strings 각 원소의 n번째가 a와 같다면 answer에 추가
# if문을 추가해 n번째 알파벳이 같다면, 사전순으로 정렬하기

# 방법2
# 리스트 안에 딕셔너리를 만들어 새로운 value값에 순서를 부여
# 그 순서대로 answer에 strings 값을 추가?

# 방법3
# 다른 함수를 찾자

#////////////////////////////////////////////////////////////////////////

#시도1
# def solution(strings, n):
#     answer,a1 = [],[]
#     for i in strings:                 #새배열 a1에, strings 각 원소의 n번째 문자 출력
#         a1.append(i[n])               
#     a1.sort()                         #a1을 사전순으로 정렬
#     for i in a1:                      # a1=["a","e","u"]
#         for k in strings:             # strings= ["bed", "car","sun"]
#             if k[n] == i:             # n번째 문자가 a1과 같으면 추가
#                 answer.append(k)
#     return answer
# 문제: 실행한 결괏값 ["abce","abcd","abce","abcd","cdx"]이 기댓값 ["abcd","abce","cdx"]과 다릅니다.
# 해결: 중복제거와 n번째가 같을 경우 사전순 정렬이 필요.

# 시도2
def solution(strings, n):
    answer,a1 = [],[]
    strings.sort()                    #strings 사전순으로 정렬
    for i in strings:                 #새배열 a1에, strings 각 원소의 n번째 문자 출력
        a1.append(i[n])               
    a1.sort()                         #a1을 사전순으로 정렬
    for i in a1:                      # a1=["a","e","u"]
        for k in strings:             # strings= ["bed", "car","sun"]
            if k[n] == i:             # n번째 문자가 a1과 같으면 추가
                if k not in answer:   #중복제거
                    answer.append(k)
    return answer
