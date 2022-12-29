# 햄버거 만들기

# 시도 1
# 66.7 / 100.0
def solution(ingredient):
    count = 0
    a= ''.join(str(s) for s in ingredient)       
    while "1231" in a: 
        count+= a.count("1231")
        a= a.replace("1231","")
    return count

# join을 이용해 문자열로 다 이어붙이고
# (1231이 없어질때까지) while 이용?    
    # '1231'의 개수를 count하고 
    # replace로 1231을 없앤다.
# count를 return한다.

# 시도2
def solution(ingredient):
    count = 0
    a= ''.join(str(s) for s in ingredient)        
    while "1231" in a: 
        a= a.replace("1231"," ")
        count+= a.count(" ")
        a= a.replace(" ","")
    return count
  
#   실패다. 다른 방법을 고민해보자.
