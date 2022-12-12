# 영어가 싫어요

#시도1
def solution(numbers):
    a = 0
    a= numbers.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5").replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9")
    return int(a)

#시도2
#replace를 이용해 영어를 해당 숫자로 바꾼다.
def solution(numbers):
    a = 0
    a= numbers.replace("zero", "0")                   
    a= a.replace("one", "1")
    a= a.replace("two", "2")
    a= a.replace("three", "3")
    a= a.replace("four", "4")
    a= a.replace("five", "5")
    a= a.replace("six", "6")
    a= a.replace("seven", "7")
    a= a.replace("eight", "8")
    a= a.replace("nine", "9")
    return int(a)
