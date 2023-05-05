#include <iostream>
//pointers
using namespace std;
int a = 37;
int *ptr;
int main() {
    ptr = &a;
    cout<<"The content of a :" << a <<endl;
    cout<<"ptr is pointing to address: "<<ptr<<endl;
    cout<<"The address of a is: "<<&a<<endl;
    cout<<"Where ptr is pointing, we have "<<*ptr<<endl;
    cout<<"The address of ptr: "<<&ptr<<endl;
    cout<<endl;
    return 0;
}
