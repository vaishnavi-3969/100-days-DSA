#include <iostream>
#include "cow.h"
//pointers
using namespace std;
int a = 37;
int *ptr;
cow *my_cow;
int main() {
    ptr = &a;
    cout<<"The content of a :" << a <<endl;
    cout<<"ptr is pointing to address: "<<ptr<<endl;
    cout<<"The address of a is: "<<&a<<endl;
    cout<<"Where ptr is pointing, we have "<<*ptr<<endl;
    cout<<"The address of ptr: "<<&ptr<<endl;
    cout<<endl;
    my_cow = new cow("Hildy",7,hide);
    cout<<my_cow->get_name() << " is a type-"<<(int)my_cow->get_purpose()<<" cow."<<endl;
    cout<<my_cow->get_name() << " is "<< my_cow->get_age()<<" years old."<<endl;
    delete my_cow; //calls destructors
    return (0);
}
