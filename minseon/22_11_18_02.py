import copy
def solution(emergency):
    answer = []
    #내림차순으로 정렬
    
    #emergency 데이터값의 보호를 위해 대입연산자 (=)을 사용한 얕은 복사가 아닌, 
    #객체를 새롭게 만들어주는 깊은 복사 coppy.deepcopy()를 사용해줌.
    
    g = copy.deepcopy(emergency)
    g.sort(reverse=True)
    #빈 진료순서 변수 만들어주기
    int_list=[]
    #오름차순 진료순서 리스트 생성
    for x in range(1,(len(emergency)+1)):
        int_list.append(x)
    # 진료순서랑 위급도 딕셔너리로 묶어주기    
    dictionary = dict(zip(g,int_list))
    # 기존 들어온 데이터 emergency 위급도를 키로 해서 진료순서 추출해서 리스트에 넣어주기
    for i in emergency:
        print(i)
        answer.append(dictionary.get(i))
    return answer
