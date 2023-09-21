n = int(input())


def fact(n):
    if n < 0:
        return "Error"
    if n == 0 or n == 1:
        return 1
    factorial = 1
    for i in range(1, n + 1):
        factorial *= i
    return factorial


print(fact(n))
