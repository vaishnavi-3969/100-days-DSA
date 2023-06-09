# write a program to sort the given list in ascending order w/o using any built in functions
def swap(list1, i, j):
    list1[i], list1[j] = list1[j], list1[i]

def ascending_order(list1):
    for i in range(0, len(list1)):
        for j in range(i, len(list1)):
            if int(list1[i]) > int(list1[j]):
                swap(list1,i,j)
    return list1


print(ascending_order([2, 4, 5, 3, 2, 5]))
print(ascending_order([9,8,7,6,5,4,3,2,1]))
