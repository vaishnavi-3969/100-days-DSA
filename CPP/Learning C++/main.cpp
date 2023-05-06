#include <iostream>
#include "cow.h"
//pointers
using namespace std;
#include <vector>
int a = 37;
int *ptr;
cow *my_cow;
vector <int> primes;

int main() {
    //vectors
    primes.push_back(2);
    primes.push_back(3);
    primes.push_back(4);
    primes.push_back(5);
    primes.push_back(6);
    primes.push_back(7);
    primes.push_back(8);
    cout<<"The vector has: "<<primes.size()<<" elements"<<endl;
    cout<<"The element at index 2 is : " <<primes[2]<<endl;
    primes[2] = 13;
    cout<<"The element at index 2 is : " <<primes[2]<<endl;

    vector<cow> cattle;
    cattle.push_back(cow("betty",6,meat));
    cattle.push_back(cow("libby",3,hide));
    cattle.push_back(cow("trudy",5,pet));
    cattle.push_back(cow("betsy",3,meat));
    //ptrs are a type of iterators
    cout<<"The first cow is: "<<cattle.begin() ->get_name() <<endl;
    cout<<"At index 1 we have "<<cattle[1].get_name()<<endl;
    cout<<"Previous to last cow is: "<< prev(cattle.end(),2)->get_name()<<endl;
    cout<<"The last cow is: "<<(cattle.end() - 1)->get_name() <<endl;

    cout<<"================================================="<<endl;
    //pointers
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
