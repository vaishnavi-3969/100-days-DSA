# Implement ADT for matrices along with arithmetic functions
# such as addition, subtraction, and multiplication

def addition(matrix1, matrix2):
    result = []
    for i in range(0, len(matrix1)):
        temp = []
        for j in range(0, len(matrix1[0])):
            temp.append(matrix1[i][j] + matrix2[i][j])
        result.append(temp)
    return result

def subtraction(matrix1,matrix2):
    result = []
    for i in range(0, len(matrix1)):
        temp = []
        for j in range(0, len(matrix1[0])):
            temp.append(matrix1[i][j] - matrix2[i][j])
        result.append(temp)
    return result

def multiplication(matrix1,matrix2):
    result = []
    for i in range(len(matrix1)):
        temp = []
        for j in range(len(matrix2[0])):
            _sum = 0
            for k in range(len(matrix2)):
                _sum += matrix1[i][k] * matrix2[k][j]
            temp.append(_sum)
        result.append(temp)
    return result

print("Matrix addition")
print(addition([[1,2,3],[4,5,6],[7,8,9]],[[1,2,3],[4,5,6],[7,8,9]]))
print("Matrix subtraction")
print(subtraction([[1,2,3],[4,5,6],[7,8,9]],[[1,2,3],[1,2,3],[1,2,3]]))
print("Matrix multiplication")
print(multiplication([[1,2,3],[4,5,6],[7,8,9]],[[-1,0,-1],[-1,0,-1],[-1,0,-1]]))



