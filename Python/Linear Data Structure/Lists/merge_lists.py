# Write a program to merge 2 lists such that all odd indices contain element from the
# second list and all the elements in even indices are from the first list

def merge_list(list1, list2):
    list3 = []
    index1 = 0
    index2 = 0
    for i in range(0, len(list1) + len(list2)):
        if i % 2 == 0:
            list3.append(list1[index1])
            index1 += 1
        else:
            list3.append(list2[index2])
            index2 += 1
    return list3


print(merge_list([0, 1, 2, 3, 4, 5], [6, 7, 8, 9, 10]))
