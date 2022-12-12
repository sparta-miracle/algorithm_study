# 겹치는 선분의 길이

# 잘 모르겠으니,,, 노가다를 하자!

# ◆lines의 원소가 겹친 곳 구하기 (for문, if문, 부등호)
#   ◇원소 0, 1을 비교
#   ◇원소 1, 2를 비교
#   ◇원소 0, 2를 비교
#   ◇중복된 값 빼주기  (if문)
#       ◆a라는 배열을 만들어 겹친 부분 a에 넣어주기     
# ◆(길이) 큰수에서 작은 수 빼기


# 불편한 점: lines의 각 원소를 비교할 때 for문을 돌리면 더 편할 것 같다.

#//////////////////////////////////////////////////////////////////

# 시도1
# def solution(lines):
#     a=[]
#     answer = 0
#     x, y= lines[1][0], lines[1][1]
#     if lines[0][0]<=x<lines[0][1] | lines[0][0]<y<=lines[0][1]:
#         if y>lines[0][1]:
#             a.append([x, lines[0][1]]) 
#         elif lines[0][0]>x:
#             a.append([lines[0][0], y])
#         else:
#             a.append([x,y])
#     v, w= lines[2][0], lines[2][1]
#     if lines[1][0]<=v<lines[1][1] | lines[1][0]<w<=lines[1][1]:
#         if w>lines[1][1]:
#             a.append([v, lines[1][1]]) 
#         elif lines[1][0]>v:
#             a.append([lines[1][0], w])
#         else:
#             a.append([v,w]) 
#     s, t= lines[0][0], lines[0][1]
#     if lines[2][0]<=s<lines[2][1] | lines[2][0]<t<=lines[2][1]:
#         if t>lines[2][1]:
#             a.append([s, lines[2][1]]) 
#         elif lines[2][0]>s:
#             a.append([lines[2][0], t])
#         else:
#             a.append([s,t])               
#     return a
# 문제: 부등호가 문제가 아닌 or 연산자 문제이다. 처음에 부등호가 문제라고 생각하며 변수를 앞에 나오게 썼다. 하지만 틀린것은 or을 표현하는 '|' 이 연산자가 잘못된 것이었다.

#//////////////////////////////////////////////////////////////////

# # 시도2
# def solution(lines):
#     a=[]                 # 겹치는 부분 2차원 배열 만들기
#     answer = 0           # 겹치는 선분의 길이
# # lines의 각 원소 비교 (for문으로 바꿔보자. 너무 비효율적 ㅠ) # for문이 아니더라도 더욱 더 좋은 방법이 있을 것 같다.  
#     x, y= lines[1][0], lines[1][1]
#     # 원소의 start나 end가 다른 원소 안에 포함될 경우
#     if lines[0][0] <=x< lines[0][1] or lines[0][0] <y<= lines[0][1]:
#         if y>lines[0][1]:                  #start만 포함
#             a.append([x, lines[0][1]]) 
#         elif lines[0][0]>x:                #end만 포함
#             a.append([lines[0][0], y])
#         else:                              #start, end 다 포함
#             a.append([x,y])
#     v, w= lines[2][0], lines[2][1]
#     if lines[1][0] <=v< lines[1][1] or lines[1][0] <w<= lines[1][1]:
#         if w>lines[1][1]:
#             a.append([v, lines[1][1]]) 
#         elif lines[1][0]>v:
#             a.append([lines[1][0], w])
#         else:
#             a.append([v,w]) 
#     s, t= lines[0][0], lines[0][1]
#     if lines[2][0] <=s< lines[2][1] or lines[2][0] <t<= lines[2][1]:
#         if t>lines[2][1]:
#             a.append([s, lines[2][1]]) 
#         elif lines[2][0]>s:
#             a.append([lines[2][0], t])
#         else:
#             a.append([s,t]) 
# # 중복된 값 제거 및 answer(겹치는 선분 길이) return          
#     if len(a) == 0:
#         answer = 0
#     elif len(a) == 1:
#         answer = a[0][1]- a[0][0]
#     elif len(a) ==2:
#         if a[1][0] <= a[0][0] < a[0][1] <= a[1][1]:
#             answer = a[1][1]- a[1][0]
#         elif a[0][0] <= a[1][0] < a[1][1] <= a[0][1]:
#             answer = a[0][1]- a[0][0]
#         elif a[0][0] <= a[1][0] < a[0][1] <= a[1][1]:
#             answer = a[1][1]-a[0][0]
#         elif a[1][0] <= a[0][0] < a[1][1] <= a[0][1]:
#             answer =  a[0][1] - a[1][0]
#     # elif len(a) == 3:
#     #     answer =                 
            
#     return answer

# 문제: lines의 각 원소 비교할 때 6가지 경우로 해야했는데 3가지로 했다. 그결과 테스트 케이스 3번이 제대로 나오지 않았다. [1,10][3,9]를 비교하는 경우, [3,9]는 [1,10]에 포함되기 때문에 배열 a에 추가되지만, 그 반대로 비교하는 경우, 배열 a에 값이 추가되지 않는다.
# 해결: 이제 for문으로 바꾸자. 제발.

#//////////////////////////////////////////////////////////////////

# 시도3
def solution(lines):
    a=[]                           # 겹치는 부분 2차원 배열 만들기
    answer = 0                     # 겹치는 선분의 길이
# lines의 각 원소 비교 (반복문)
    for i,k in range(2):
        if lines[i][0] <= lines[k][0] < lines[i][1] or lines[i][0] <lines[k][1]<= lines[i][1]: 
            # 원소의 start나 end가 다른 원소 안에 포함될 경우
            if lines[k][1]>lines[i][1]:         #start만 포함
                a.append([lines[k][0], lines[i][1]]) 
            elif lines[i][0]>lines[k][0]:       #end만 포함
                a.append([lines[i][0], lines[k][1]])
            else:                               #start, end 다 포함
                a.append([lines[k][0],lines[k][1]])
            
# 중복된 값 제거 및 answer(겹치는 선분 길이) return          
    if len(a) == 0:
        answer = 0
    elif len(a) == 1:
        answer = a[0][1]- a[0][0]
    elif len(a) ==2:
        if a[1][0] <= a[0][0] < a[0][1] <= a[1][1]:
            answer = a[1][1]- a[1][0]
        elif a[0][0] <= a[1][0] < a[1][1] <= a[0][1]:
            answer = a[0][1]- a[0][0]
        elif a[0][0] <= a[1][0] < a[0][1] <= a[1][1]:
            answer = a[1][1]-a[0][0]
        elif a[1][0] <= a[0][0] < a[1][1] <= a[0][1]:
            answer =  a[0][1] - a[1][0]
    # elif len(a) == 3:
    #     answer =                 
            
    return a
  
#   실패 더 고민해보자.
