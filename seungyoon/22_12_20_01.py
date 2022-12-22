def solution(common):
    Existence_of_zero = False
    for i in common:
        if i == 0:
            Existence_of_zero = True
    if Existence_of_zero:
        return common[len(common) - 1] + (common[len(common) - 1] - common[len(common) - 2])
    else:
        등차 = common[len(common) - 1] + (common[len(common) - 1] - common[len(common) - 2])
        등비 = common[len(common) - 1] * (common[len(common) - 1] / common[len(common) - 2])
        if 등비 / common[len(common) - 1] == common[1] / common[0]:
            return 등비
        else:
            return 등차
        
    # 런타임 에러가 떴던 이유 = 0을 나누려고 해서
