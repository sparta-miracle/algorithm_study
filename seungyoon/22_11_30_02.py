
import math
def solution(n):
    for i in range(n * 10):
        if n < math.factorial(i):
            return i - 1
