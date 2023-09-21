# Read input as sepcified in the question
# Print output as specified in the question

n = int(input())
lst = input().split()
newLst = lst[::-1]
for i in range(0,n):
    print(newLst[i],end=" ")