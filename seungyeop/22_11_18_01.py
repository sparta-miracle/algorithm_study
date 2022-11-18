def solution(my_string):
    vowels = ["a", "e", "i", "o" , "u"] # string으로 "aeiou"로 적어도 문제 없었다.
    for vow in vowels:
        my_string = my_string.replace(vow, "")
            
    return my_string
