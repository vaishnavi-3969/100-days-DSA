from os import *
from sys import *
from collections import *
from math import *

n = int(input())
lst = input().split()
target = int(input())

lastIndex = -1

for i in range(0, n):
    if int(lst[i]) == target:
        lastIndex = i

print(lastIndex)
