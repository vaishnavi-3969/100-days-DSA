def rotateArray(arr: list, k: int) -> list:
    for i in range(0, k):
        arr = rotateLeftOnce(arr)
    return arr


def rotateLeftOnce(arr):
    n = len(arr)
    start = arr[0]
    for i in range(0, n - 1):
        arr[i] = arr[i + 1]
    arr[n - 1] = start
    return arr


print(rotateArray([1, 2, 3, 4, 5], 4))
