def factorial(n):
  result = n
  for i in range(n, 1, -1):
    result = result * (i-1)
  return result
# ((((5 * 4) * 3) * 2) * 1)

def factorialRec(n):
  if n == 1:
    return 1
  return n * factorialRec(n-1)

# n=5 => 5 * (4 * (3 * (2 * (1))))
print(factorial(5))