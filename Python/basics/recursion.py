def fibonacci(N):
    if N == 1:
        return 0
    elif N == 2:
        return 1
    else:
        return fibonacci(N - 1) + fibonacci(N - 2)


def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)


print(fibonacci(5))
print(factorial(5))
