# 최소 힙
import heapq
import sys

num = int(sys.stdin.readline())
a = []

for i in range(num):
    x = int(sys.stdin.readline())
    if x == 0 and len(a) == 0:
        print(0)
    elif x == 0:
        print(a[0])
        heapq.heappop(a)
    elif x > 0 :
        heapq.heappush(a, x)
