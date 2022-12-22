#영어가 싫어요

import re
def solution(numbers):
    numbers = re.sub("one","1",numbers)
    numbers = re.sub("two", "2", numbers)
    numbers = re.sub("three", "3", numbers)
    numbers = re.sub("four", "4", numbers)
    numbers = re.sub("five", "5", numbers)
    numbers = re.sub("six", "6", numbers)
    numbers = re.sub("seven", "7", numbers)
    numbers = re.sub("eight", "8", numbers)
    numbers = re.sub("nine", "9", numbers)
    numbers = re.sub("zero", "0", numbers)
    answer = int(numbers)
    return answer
