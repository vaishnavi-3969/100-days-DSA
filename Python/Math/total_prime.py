def totalPrime(s, e):
    count = 0
    for i in range(s, e + 1):
        if (isPrime(i)):
            count += 1
    return count


def isPrime(n):
    if n == 0:
        return False
    if n == 1:
        return True
    end = (n // 2) + 1
    for i in range(2, end):
        if n % i == 0:
            return False
    return True


# Taking S and E space seperated input.
S, E = map(int, input().split(' '))
print(totalPrime(S, E))

