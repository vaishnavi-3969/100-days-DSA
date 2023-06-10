# infix to postfix conversion

def infix_2_postfix(infix):
    # precedence of operators
    precedence = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}

    # stack to store operators
    stack = []

    # postfix string
    postfix = ''

    # loop through the infix string
    for char in infix:
        # if char is an operand
        if char.isalpha():
            postfix += char
        # if char is an opening bracket
        elif char == '(':
            stack.append(char)
        # if char is a closing bracket
        elif char == ')':
            while stack and stack[-1] != '(':
                postfix += stack.pop()
            stack.pop()
        # if char is an operator
        else:
            while stack and stack[-1] != '(' and precedence[char] <= precedence[stack[-1]]:
                postfix += stack.pop()
            stack.append(char)

    # pop all the remaining operators
    while stack:
        postfix += stack.pop()

    return postfix


infix = 'a+b*(c^d-e)^(f+g*h)-i'
print(infix_2_postfix(infix))