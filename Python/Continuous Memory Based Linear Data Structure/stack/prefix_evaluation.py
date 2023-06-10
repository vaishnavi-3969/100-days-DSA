def is_operator(o):
    operator = ['+','-','*','/','^']
    return True if o in operator else False

def eval(v1,v2,o):
    val1 = int(v1)
    val2 = int(v2)
    return{
        '+':val1 + val2,
        '-':val1 - val2,
        '*':val1 * val2,
        '/':val1 / val2,
        '^':val1 ^ val2
    }[o]

def prefix_evaluation(exp):
    value_stack = stack()
    e = exp.split(" ")
    l = len(e)
    while(l > 0):
        i = e[l-1] 
        if is_operator(i):
            if(value_stack.size() > 1):
                tmp = eval(value_stack.pop(), value_stack.pop(), i)
                value_stack.push(str(tmp))
                # before pushing covert back to string 
            else:
                print('value stack empty, wrong expression')
                return -1
        elif i != ' ':
            value_stack.push(i)
        l = l - 1
    if(value_stack.size() == 1):
        return int(value_stack.pop())
    else:
        print('wrong expression')
        return -1






