def solution(emergency):
    answer = []
    순서 = []
    
    for i in range(len(emergency)): # 그냥 emergency에 하니깐
        answer.append(emergency[i]) # null 뜸..
        
    sorted_answer = sorted(answer, reverse = True)
    
    for i in answer:
        순서.append(sorted_answer.index(i) + 1)
        
    return 순서
