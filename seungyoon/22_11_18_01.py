def solution(my_string):
    삭제 = "aeiou"
    for i in range(len(삭제)):
        my_string = my_string.replace(삭제[i],"")
    return my_string
    # answer = my_string
    # for char in my_stirng:
        # if char in "aeiou":
            # answer = answer.replace(str, '')
    # return answer
    
    
    #my_string.replace('a', '')
    #my_string.replace('e', '')
    #my_string.replace('i', '')
    #my_string.replace('o', '')
    #my_string.replace('u', '')
    
