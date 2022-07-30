
class StackWithMin:
  """A stack with minimum() method"""

  def __init__(self):
    self.stack = []
    self.min = []

  # O(1)
  def push(self, value):
    if (self.minimum() is None or value <= self.minimum()):
      self.min.append(value)
    self.stack.append(value) # 3, 2, 1, 1, 4

  # O(1)
  def pop(self):
    value = self.stack.pop()
    if value == self.minimum():
      self.min.pop()
    return value

  # O(1)
  def minimum(self): # 3
    return self.min[-1] if self.min else None

stack = StackWithMin()
stackB = StackWithMin()
stack.push(3)
stack.push(2)
stack.push(1)
stack.push(1)
stack.push(4)
print(stack.minimum()) # 1
stack.pop()
stack.pop()
print(stack.minimum()) # 1
stack.pop()
print(stack.minimum()) # 2
print(stack.pop()) # 2
print(stack.pop()) # 3
