# stack implementation using pointer
class stack:
    def __init__(self):
        self.__s = []
        self.__top = -1
    
    def push(self, element):
        self.__top += 1
        self.__s.append(element)

    def print_stack(self):
        if(self.is_empty()):
            print("Stack Empty")
        else:
            print("Top to down order")
            print(self.__s[::-1]) #-1 -> backward
    
    def is_empty(self):
        if(self.size == 0):
            return 1
        return 0
    
    def size(self):
        return self.__top + 1
    
    def pop(self):
        if(self.is_empty()==0):
            res = self.__s.pop(self.__top)
            self.__top -= 1
            return res
        else:
            return -1
        
    def top(self):
        if(self.is_empty == 0):
            return self.__s[self.__top]
        else:
            return -1

s = stack()
s.push(1)
s.push(2)
s.push(3)
s.push(4)
s.print_stack()
print("Size of stack: ", s.size())
print("Pop: ", s.pop())
print("Size of stack: ", s.size())
print("Top: ", s.top())
s.print_stack()
print("Pop: ", s.pop())
s.print_stack()
print("Pop: ", s.pop())
s.print_stack()
print("Pop: ", s.pop())
s.print_stack()
print("Size of stack: ", s.size())
print("Top: ", s.top())
s.print_stack()