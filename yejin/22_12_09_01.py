# 치킨 쿠폰

def solution(chicken):
    rest = 0 #남는 보너스 쿠폰
    a = 0 #서비스치킨
    while(chicken>9):        #치킨 1081 >108
        # rest+= chicken%10    #남는쿠폰 1 >8
        a+= chicken//10       #서비스 108 >10
        chicken= chicken//10   #서비스치킨 108
        chicken+= rest
        
    return a

# def solution(chicken):
#     rest = 0 #남는 보너스 쿠폰
#     a = 0 #서비스치킨
#     while(chicken>9):        #치킨 1081 >108
#         rest+= chicken%10    #남는쿠폰 1 >8
#         a+= round(chicken//10)      #서비스 108 >10
#         chicken= round(chicken//10)   #서비스치킨 108
#         chicken+= rest
        
#     return a

# 실패 더 고민해보자
