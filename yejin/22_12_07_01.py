# 연속된 수의 합 => 실패
# 방법1 방정식 import
from sympy import Symbol, solve
def solution(num, total):
    a=0
    b=0
    n=Symbol('n')
    for i in range(1, n):
        b+=n+a
        a+=1
    equation = b-total
    n=solve(equation)
    
    answer = []
    return answer

# 문제: 방정식을 import해서 해결하려 했으나 코드 구현이 되지 않았다.

# for문을 돌려
# # 
# 연속된 수의 시작수인 n을 구하기
# n= n
# n+(n+1)= 2n+1 = 2(n+ 1/2)
# n+(n+1)+(n+2)= 3n+3= 3(n+1)
# n+(n+1)+(n+2)+(n+3)+(n+4)= 5n+10= 5(n+2)
# n+(n+1)+(n+2)+(n+3)+(n+4)+(n+5)= 6n+15= 3(2n+5) = 6(n+ 5/2)

# n=3, 4n= n+(n+1)+(n+2)
# n=1, 15n= n+(n+1)+(n+2)+(n+3)+(n+4)
# n=2, 7n= n+(n+1)+(n+2)+(n+3)
# n=-1, -5n= n+(n+1)+(n+2)+(n+3)+(n+4)
