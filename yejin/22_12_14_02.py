# 평행
# 선분을 2개씩 잇는 3가지 경우 if문
# 평행한지 비교해서 평행이면, 1출력 

# 방법1
# (선분의 기울기가 같을 때)
# (y절편이 같든 다르든)

# 방법2
# (삼각형 닮음, 길이의 비 비교)
# 두 선분의 x절편을 각각 a1, a2라고 한뒤
#   1) 두 선분이 1,3 사분면에 있을시,
#   x1,x2보다 크고 y축과 평행한 선분 그어 삼각형 만들기
#   2) 두 선분이 2,4 사분면에 있을시,
#   x1,x2보다 작고 y축과 평행한 선분 그어 삼각형 만들기
# 이때 평행한 선분이 x축과 만나는 부분을 v라고 하고, 두 선분과 만나는 점을 각각 b1, b2라고 한다
# 선분v b1과 선분 v b2 길이의 비와
# 선분v a2와 선분 v a1 길이의 비를 비교한다.
# ---------------------------------

#시도1 81.8

# import matplotlib.pylab as pl
# import numpy as np
def solution(dots):

    m1= (dots[3][1]-dots[0][1])/(dots[3][0]-dots[0][0])
    m2= (dots[2][1]-dots[1][1])/(dots[2][0]-dots[1][0])
    m3= (dots[3][1]-dots[2][1])/(dots[3][0]-dots[2][0])
    m4= (dots[1][1]-dots[0][1])/(dots[1][0]-dots[0][0])
    m5= (dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0])
    m6= (dots[2][1]-dots[0][1])/(dots[2][0]-dots[0][0])
    if m1 == m2 or m3==m4 or m5==m6:
        return 1
    else:
        return 0     

# 시도2 72.7점 (Numpy모듈, trunc)

# def solution(dots):
#     import math
#     import numpy as np
#     answer=0
#     slope, intercept = np.polyfit(dots[0],dots[1],1)
#     a=math.trunc(slope)
#     slope, intercept = np.polyfit(dots[2],dots[3],1)
#     x=math.trunc(slope)
    
#     slope, intercept = np.polyfit(dots[0],dots[2],1)
#     b=math.trunc(slope)
#     slope, intercept = np.polyfit(dots[1],dots[3],1)
#     y=math.trunc(slope)
    
#     slope, intercept = np.polyfit(dots[0],dots[3],1)
#     c=math.trunc(slope)
#     slope, intercept = np.polyfit(dots[1],dots[2],1)
#     z=math.trunc(slope)
    
#     if a==x or b==y or c==z:
#         answer=1
#     else:
#         answer=0
#     return answer
    
# 시도3 81.8점 (Numpy모듈, round)
def solution(dots):
    import math
    import numpy as np
    answer=0
    slope, intercept = np.polyfit(dots[0],dots[1],1)
    a=double(slope)
    slope, intercept = np.polyfit(dots[2],dots[3],1)
    x=double(slope)
    
    slope, intercept = np.polyfit(dots[0],dots[2],1)
    b=double(slope)
    slope, intercept = np.polyfit(dots[1],dots[3],1)
    y=double(slope)
    
    slope, intercept = np.polyfit(dots[0],dots[3],1)
    c=double(slope)
    slope, intercept = np.polyfit(dots[1],dots[2],1)
    z=double(slope)
    
    if a==x or b==y or c==z:
        answer=1
    else:
        answer=0
    return answer
    
# 시도4 (scipy모듈 사용) 오류
# from scipy.stats import linregress
# def solution(dots):
#     slope, intercept, r_value, p_value, std_err = linregress(dots[0], dots[1])
#     a=slope
#     slope, intercept, r_value, p_value, std_err = linregress(dots[2], dots[3])
#     x=slope
    
#     slope, intercept, r_value, p_value, std_err = linregress(dots[0], dots[2])
#     b=slope
#     slope, intercept, r_value, p_value, std_err = linregress(dots[1], dots[3])
#     y=slope
    
#     slope, intercept, r_value, p_value, std_err = linregress(dots[0], dots[3])
#     c=slope
#     slope, intercept, r_value, p_value, std_err = linregress(dots[1], dots[2])
#     z=slope
    
#     if a==x or b==y or c==z:
#         return 1
#     else:
#         return 0
