# using 2d array (nested lists) to implement an element counter.
# given a list of elements, the final structure should have the distinct elements and the count of each elemnt in a table format

def two_d_list(list1):
    counter_element_list = []
    elements = unique_elements(list1)
    for element in range(len(elements)):
        counter = 0
        for number in range(len(list1)):
            if elements[element] == list1[number]:
                counter += 1
        counter_element_list.append(counter)
    return [elements, counter_element_list]


def unique_elements(list1):
    unique = []
    for i in range(0, len(list1)):
        if list1[i] in unique:
            continue
        unique.append(list1[i])
    return unique


def tabular_format(elements, counter):
    print("-------------------")
    print("| Element | Count |")
    print("-------------------")
    for i in range(len(elements)):
        print("| ",elements[i], "     |  ", counter[i],"  |")
        print("-------------------")

def print_in_tabular_format(list1):
    elements, counter = two_d_list(list1)
    tabular_format(elements, counter)
    
print(print_in_tabular_format([1,2,3,4,1,2,1]))
