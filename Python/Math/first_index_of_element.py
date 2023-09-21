n = int(input())
lst = input().split()
x = int(input())
check = False
for i in range(0, len(lst)):
    if int(lst[i]) == x:
        print(i)
        check = True
        break

if not check:
    print(-1)
print(lst)