def solution(A):
  counter = {}
  for value in A:
    counter[value] = counter.get(value, 0) + 1
  for value, count in counter.items():
    if (count % 2 != 0):
      return value

# n + n/2 + 1 -> O(n)
print(solution([3, 2, 1, 4, 1, 2, 3])) # 4 
print(solution([3, 2, 3, 4, 3, 2, 3])) # 4