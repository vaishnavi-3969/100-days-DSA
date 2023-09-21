from typing import List


def printDivisors(n: int) -> List[int]:
    lst = []
    for i in range(1, n + 1):
        if n % i == 0:
            lst.append(i)
    return lst

print(printDivisors(10))