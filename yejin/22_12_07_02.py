# 특정 문자 제거하기
# 방법1
# for문, if문, replace(a, b) 이용
def solution(my_string, letter):
    a= my_string
    for i in my_string:
        if i == letter:
            a = a.replace(i, '')
    return a

 #/////////// for문을 제외하고 좀 더 간단하게 만들 방법이 없을까? 아래방법!/////////////////////// 
  
# 방법2  
# replace(a, b)이용
def solution(my_string, letter):
    a = my_string.replace(letter, '')
    return a
