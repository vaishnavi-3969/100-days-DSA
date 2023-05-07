#include <iostream>
#include <string>
#include <cstdint>
#include <cstring>
#include "cow.h"

#define CAPACITY 5000
#define DEBUG
#define AGE_LENGTH 4
//const int AGE_LENGTH = 4;
using namespace std;
//structure
//struct cow{
//class cow{
//public:
//    cow(string name_i, int age_i, unsigned char purpose_i){
//        name = name_i;
//        age = age_i;
//        purpose = purpose_i;
//    }
//    string get_name(){
//        return name;
//    }
//    unsigned char get_purpose(){
//        return purpose;
//    }
//    int get_age(){
//        return age;
//    }
//private:
//    string name;
//    int age;
//    unsigned char purpose;
//};
//enum cow_purpose {dairy, meat, hide, pet};

//string
const int LENGTH1 = 25;
char array_str1[LENGTH1] = "Hey world! ";
char array_str2[] = "What's up?";

string std_str1 = "Hi everyone! ";
string std_str2 = "How's the josh? ";
//declaring array
 int age[AGE_LENGTH];
 float temperature[] = {31.5, 32.5,34.5};

 //type inference
auto c = 8; //implementation dependent
auto d = 3434353;
auto e = 3.14f;
auto f = 3.14;
auto g = true;
auto h= 'd';

int a,b=5; //global variables
float fit = -7.44f;
int32_t sgn;
uint32_t unsgn;

int main(){
    //object
    cow my_cow("Besty",5,dairy);

    //structure
//    cow my_cow;
//    my_cow.age = 5;
//    my_cow.name = "Betsy";
//    my_cow.purpose = dairy;
    cout<<my_cow.get_name() << " is a type-" <<(int)my_cow.get_purpose()<<" cow."<<endl;
    cout<<my_cow.get_name() << " is "<< my_cow.get_age() <<" years old."<<endl;
    //typcasting
    sgn = fit;
    unsgn = sgn;
    cout << "Float: "<<fit <<endl;
    cout <<"int32: "<<sgn<<endl;
    cout << "uint32: "<<unsgn<<endl;

    //string
    strcat_s(array_str1,LENGTH1,array_str2);
    cout << array_str1 << endl;
    cout <<std_str1 + std_str2 <<endl;

    //arrays
    age[0] = 25;
    age[1] = 35;
    age[2] = 45;
    age[3] = 55;
//    age[4] = 65;
    cout<<"The array age has: "<<AGE_LENGTH<<" elements."<<endl;
    cout <<"age[0]: "<<age[0]<<endl;
    cout <<"age[1]: "<<age[1]<<endl;
    cout <<"age[2]: "<<age[2]<<endl;
    cout <<"age[3]: "<<age[3]<<endl;
    cout <<"The average of all ages in the array: "<<(age[0]+age[1]+age[2]+age[3]+age[4])/5<<endl;
    cout <<endl;
    cout << "temperature array: "<<endl;
    cout << "temperature[0]"<<temperature[0]<<endl;
    cout << "temperature[1]"<<temperature[1]<<endl;
    cout << "temperature[2]"<<temperature[2]<<endl;
    cout << "temperature[3]"<<temperature[3]<<endl;

    int32_t large = CAPACITY;
    uint8_t small = 37;
#ifdef DEBUG
    cout <<"[About to perform the addition]" <<endl;
#endif
    large += small;
    cout << "The large integer is: " <<large <<endl;

    cout << typeid(c).name() <<endl;
    cout << typeid(d).name() <<endl;
    cout << typeid(e).name() <<endl;
    cout << typeid(f).name() <<endl;
    cout << typeid(g).name() <<endl;
    cout << typeid(h).name() <<endl;

    bool my_flag = false;
    string str;
    a = 7;
    cout<<"Enter your name: "<<endl;
    cin >> str;
    cout<<"Your name: "<<str<<'\n';
    cout<< "a: "<<a<<'\n';
    cout<<"b: "<< b << '\n';
    cout << "flag: "<<my_flag<<endl;
    cout<<"a + b: "<<a + b<<endl;
    cout<<"a - b: "<<a - b << endl;
    unsigned int positive;
    cout << "b - a: "<< b - a <<endl;
    positive = b - a; // 2 ^ 32 - 2 (2's complement of -2 in binary
    cout << "b - a (unsigned): " << positive <<endl;
    return(0);
}
