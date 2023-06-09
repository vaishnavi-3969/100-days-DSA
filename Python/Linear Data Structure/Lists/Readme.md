
Linear Data Structures
- an array is a collection of memory locations. It is a per-defined data structure in all programming langugaes
Initialization
a  = [] //empty list
a = [1,2,3,4,5] //list of 5 elements
a = [] * (5) //empty list of size 5

Basic operations of list:
1. Insertion
2. Deletion
3. Merging

Advantage of using python list: functions are predefined and can be simply called for usage. eg. list.insert(index, element)

Algorithm for deleting an element from list
    def delete(a[],element)
        index = 0
        Loop i in a
            if a[i] = element
            then,
                index = i
                break
        Loop i from index+1 to n-1
            Assign a[i] to a[i-1]
        Delete a[i-1]
        return element

- there is also a predefined function for removing an element from the list
- list.remove(element)
- merging => cocatenating the contents of one list into a new list

# predefined functions for list
list.append(element): append a new element to the end of the list
list.count(element): returns the no. of instances of the given element, if it is present in the list
list.extend(sequence): append the elements of the sequence into the list
list.index(element): searches for the first instance of the element in the list and returns the index
list.pop(): removes and returns the last element from the list. optional argument: index of the element to be removed and returned
list.reverse(): reverses the given list
list.sort(): sorts the given list in ascending order. optional arg: based on which it would be sorted

len(list): length of the list
list1 + list2: concatenates list1 and list2 and returns a new list
[element]*number: repetition: creates a list while repeating the element for a specified no. of times
x in ['x','y','z']: membership: returns true/false signifying if the given element is present in the given list or not
for i in list: print i -> iteration -> traverses through each element in the list

# Lists can have elements of any type
application: string handling
string -> sequence of characters

Python sequences ->
Available sequences in python:
1. string
2. byte sequences
3. lists
4. byte arrays
5. tuple

String: character version of lists
S = str() #empty string
S = str('Data Structure') #string w/ data structure stored in it

- all the operations in string are supported in string as well

Tuples: immutable lists => () around the elements in the declaration
(): tuples
[]: lists
- there cannot be an empty tuple -> immutable

Byte sequence and byte arrays:
- byte sequences are immutable

Errors can be handled in 3 modes:
- strict
- ignore
- replace

Points to remember:
1. Linear data structure are a type of data structure that store a collection of elements one after the other in a linear sequence
2. a list is a primitive heterogeneous data types(data of diff. types). the data elements are stored in contiguouos memory locations
3. referential accessing is possible in arrays, as memory blocks are in continuous array & all other blocks can be relatively accessed using formula 'biasing address + no.of blocks'
4. lists are implemented using classes in python
5. lists have many operators overloaded with '+' for concatenation adn '*" for repeating an element for 'n' times
6. strings are lists for characters in python
7. bytes sequences encode the string and thne save those as bytes
8. tuples are an immutable list

Python lists: a class in python which is implemented as data structure to store a collection of elements of various different types in a sequential pattern in continouous memory locations
Primitive data structure: a basic data structure in-built in all programming languages
