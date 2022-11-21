def solution(s):
    number_list = s.split()
    num_list = []
    for i in range(len(number_list)):
        num_list.append(int(number_list[i]))
    string = f"{min(num_list)} {max(num_list)}"
    return string
