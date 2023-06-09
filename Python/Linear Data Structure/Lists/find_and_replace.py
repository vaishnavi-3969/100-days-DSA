# Implement find and replace as a function that finds a given element
# from a list and replaces all the instances with another elemnet
# in addition try implementing find and replace with regular expressions
# for partial match and searches that are not case sensitive
import re


def find_and_replace(list1, find, replace):
    for i in range(0, len(list1)):
        if (list1[i] == find):
            list1[i] = replace
    return list1


def find_and_replace_using_regex(list1, find, replace):
    string = re.sub(str(find), str(replace), str(list1))
    return string


print("Find and replace using iteration: ")
print(find_and_replace([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], 2, 10))
print("Find and replace using regular expression: ")
print(find_and_replace_using_regex([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], 2, 10))
