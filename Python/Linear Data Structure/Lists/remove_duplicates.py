# write a function to remove duplicates from a list
def remove_duplicates(list1):
    lst = []
    for i in range(0, len(list1)):
        if list1[i] in lst:
            continue
        else:
            lst.append(list1[i])
    return lst

print(remove_duplicates([1,2,3,2,4,2,4]))   
print(remove_duplicates([1,1,1,1,1,1,1,4,2,4,2]))