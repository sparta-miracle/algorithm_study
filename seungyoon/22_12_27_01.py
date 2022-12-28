def solution(numbers, direction):
    if direction == "left":
        numbers.append(numbers[0])
        del numbers[0]
    elif direction == "right":
        numbers.insert(0, numbers[len(numbers) - 1])
        del numbers[len(numbers) - 1]
    return numbers
