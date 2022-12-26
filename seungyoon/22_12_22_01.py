def solution(babbling):
    answer = 0
    for i in babbling:
        a = len(i)
        if i.count("aya") > 0:
            a -= 3
        if i.count("ye") > 0:
            a -= 2
        if i.count("woo") > 0:
            a -= 3
        if i.count("ma") > 0:
            a -= 2
        if a == 0:
            answer += 1
        
    return answer
