def solution(number):

#     count = 0
#     for i in range(len(number)):
#         if i + 2 <= len(number) - 1:
#             if number[i] + number[i+1] + number[i+2] == 0:
#                 count += 1
#             print(number[i] + number[i+1] + number[i+2])    
#         # elif i + 1 <= len(number) - 1:
#         #         if number[i] + number[i+1] + number[0] == 0:
#         #             count += 1
#         # elif i == len(number) - 1:
#         #         if number[i] + number[0] + number[1] == 0:
#         #             count += 1
#     return count
    count = 0
    for i in range(len(number)-2):
        for j in range(i+1,len(number)-1):
            for k in range(j+1,len(number)):
                if number[i] + number[j] + number[k] == 0:
                    count += 1
    return count
