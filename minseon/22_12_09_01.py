#치킨 쿠폰

def solution(chicken):
    answer=0
    while(chicken>=10):
        bonus = chicken // 10
        chicken_copon = chicken % 10
        answer += bonus
        chicken = bonus + chicken_copon
    return answer
