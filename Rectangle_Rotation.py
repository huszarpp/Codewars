import math

def rectangle_rotation(a, b):
  sqrt_a = int(a / math.sqrt(2))
  sqrt_b = int(b / math.sqrt(2))
      
  return (sqrt_a + 1) * (sqrt_b + 1) + sqrt_a * sqrt_b - (1 if (sqrt_a % 2 != 0) ^ (sqrt_b % 2 != 0) else 0)
