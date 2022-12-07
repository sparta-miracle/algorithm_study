def solution(num_list, n):
    arr = [[0 for j in range(n)] for i in range(len(num_list) // n)]
    
    q = 0
    
    for t in range(len(num_list) // n):
        for y in range(n):
            if q < len(num_list):
                arr[t][y] = num_list[q]
                q += 1

        
    return arr
