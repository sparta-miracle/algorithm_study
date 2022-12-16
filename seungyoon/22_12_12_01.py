def solution(i, j, k):
    a = [n for n in range(i,j+1)]   # i부터 j까지의 정수를 배열에 넣어주기
    return str(a).count(str(k))     # 정수 배열을 문자열 배열로 바꿔주고, count로 문자열 k가 들어간 문자열의 숫자 세기
