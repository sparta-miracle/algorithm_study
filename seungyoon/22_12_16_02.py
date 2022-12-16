def solution(n, arr1, arr2):
    비밀지도1 = []
    비밀지도2 = []
    
    # 비밀지도들을 2진수 값으로 변환
    # zfill 함수는 문자열을 특정 길이로 맞추기 위해 앞에 0을 추가해주는 함수
    # format(정수,"b")는 정수를 2진수로 바꿔주는 함수
    for i in range(n):
        지도1 = format(arr1[i],"b").zfill(n)
        지도2 = format(arr2[i],"b").zfill(n)
        진짜지도 = format(arr1[i],"b").zfill(n)
        비밀지도1.append(지도1)
        비밀지도2.append(지도2)
    
    # 2진수로 변환된 비밀지도 두개를 대조하여 진짜지도 만들기
    A = ""
    for i in range(n):
        A += "*"   
        for j in range(n):
            if 비밀지도1[i][j] == "1" or 비밀지도2[i][j] == "1":
                A += "#"
            elif 비밀지도1[i][j] == "0" and 비밀지도2[i][j] == "0":
                A += " "
    진짜지도 = A.split("*")
        
    return 진짜지도[1:] # 0인덱스에는 공백이 있으므로 1인덱스부터 시작
