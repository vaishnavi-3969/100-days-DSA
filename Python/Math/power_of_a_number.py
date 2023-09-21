from sys import *

input_values = stdin.readline().strip().split()
x = int(input_values[0])
n = int(input_values[1])
if x == 0 and n == 0:
    print(1)
else:
    print(x ** n)
