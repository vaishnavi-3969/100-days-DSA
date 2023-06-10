class queue:
    def __init__(self):
        self.__q = []
        self.__front = -1
        self.__rear = -1
    
    def is_empty(self):
        if self.__front == self.__rear:
            return 1
        return 0
    
    def size(self):
        if(self.is_empty==0):
            return self.__front == self.__rear
        else:
            return 0
        
    def front(self):
        if(self.is_empty == 0):
            return self.__q[self.__front]
        

    def enqueue(self, element):
        if(self.is_empty == 1):
            self.










