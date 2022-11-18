def solution(emergency):
    emergency_list = [0] * len(emergency)
    for i in range(len(emergency)):
        
        emergency_list[emergency.index(max(emergency))] = i + 1
        emergency[emergency.index(max(emergency))] = 0
            
    return emergency_list
  
  # return (sorted(emergency, reverse=True).index(e) + 1 for e in emergency) # 한 줄에 끝내는 코드. 보고 박수쳤다. 알아두면 유용할 것 같다.
