def solution(chicken):
    Maximum_service_chicken = 0
    while chicken >= 10:
        Maximum_service_chicken += chicken / 10
        chicken = chicken / 10
    return round(Maximum_service_chicken)
