# 옹알이 (1)

def solution(babbling):
    count, max = 0, 0
    a= ["aya", "ye", "woo", "ma"]
    for i in babbling:
        for j in a:
            if j in i:
                count +=1
        if max < count:
            max= count
        count = 0
    return max
  
#   실패
