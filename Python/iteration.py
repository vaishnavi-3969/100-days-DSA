def fibonacci(n):
    a = 0
    b = 1
    fibo = [a, b]
    for i in range(2, n):
        c = a + b
        a = b
        b = c
        fibo.append(b)
    return fibo[n - 1]


def factorial(n):
    a = 1
    for i in range(1, n+1):
        a = a * i
    return a


print(fibonacci(5))
print(fibonacci(0))
print(factorial(5))
print(factorial(0))