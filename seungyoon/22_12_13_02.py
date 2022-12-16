def solution(board):
    for i in range(len(board)):
        for j in range(len(board)):
            board_시작 = 0
            board_끝 = len(board) - 1
            위 = i - 1
            아래 = i + 1
            왼쪽 = j - 1
            오른쪽 = j + 1
            위험지대 = 2
            if board[i][j] == 1:
                if 위 >= board_시작:                           # 위
                    if board[위][j] != 1:
                        board[위][j] = 위험지대
                if 아래 <= board_끝:                           # 아래
                    if board[아래][j] != 1:
                        board[아래][j] = 위험지대        
                if 왼쪽 >= board_시작:                          # 왼쪽
                    if board[i][왼쪽] != 1:
                        board[i][왼쪽] = 위험지대
                if 오른쪽 <= board_끝:                          # 오른쪽
                     if board[i][오른쪽] != 1:
                        board[i][오른쪽] = 위험지대
                if 위 >= board_시작 and 왼쪽 >= board_시작:      # 왼쪽 위
                     if board[위][왼쪽] != 1:
                        board[위][왼쪽] = 위험지대
                if 위 >= board_시작 and 오른쪽 <= board_끝:      # 오른쪽 위
                    if board[위][오른쪽] != 1:
                        board[위][오른쪽] = 위험지대
                if 아래 <= board_끝 and 왼쪽 >= board_시작 :     # 왼쪽 아래
                    if board[아래][왼쪽] != 1:
                        board[아래][왼쪽] = 위험지대
                if 아래 <= board_끝 and 오른쪽 <= board_끝 :     # 오른쪽 아래
                    if board[아래][오른쪽] != 1:
                        board[아래][오른쪽] = 위험지대
                        
    # 0의 개수 세기
    answer = 0
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] == 0:
                answer += 1
    return answer
