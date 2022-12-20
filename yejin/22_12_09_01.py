# 치킨 쿠폰

# 시도2
def solution(chicken):
    rest = 0 #남는 보너스 쿠폰
    a = 0 #서비스치킨
    while(chicken>9):        
        rest= chicken%10    
        a+= chicken//10       
        chicken= chicken//10  
        chicken+= rest
    return a

# return= 서비스치킨 최대!!
#치킨 전체쿠폰 chicken 1081 >108+1 > 10+9 > 1+9 > 0
#남는쿠폰 rest 1 >8+1 > 9 > 0
#서비스치킨 a 108 >108+10>108+10+1> 108+10+1+1


# 시도1
# def solution(chicken):
#     rest = 0 #남는 보너스 쿠폰
#     a = 0 #서비스치킨
#     while(chicken>9):        #치킨 1081 >108
#         rest+= chicken%10    #남는쿠폰 1 >8
#         a+= round(chicken//10)      #서비스 108 >10
#         chicken= round(chicken//10)   #서비스치킨 108
#         chicken+= rest
        
#     return a

# 문제: 입출력 예는 남는 쿠폰을 모두 더해 마지막에 10장 이상일때 서비스 치킨의 개수를 구한다.
# 하지만 나는 chicken을 나눌때마다 남는 쿠폰을 전체 쿠폰에 더해주었다.
# 해결: 즉 나는 rest에 남는 보너스 쿠폰을 계속해서 더해주는게 아니라, 할당해주어야 한다.
# rest+= chicken%10 이 아닌, rest= chicken%10 이렇게 해줘야 한다.
