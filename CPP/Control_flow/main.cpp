#include <iostream>
#include <vector>

using namespace std;
 int a = 1023;
 bool flag = false;
 char letter = 'd';
 float operand_1,operand_2, result;
 char operation;
//while loop
vector<int> numbers = {12,34,53,24,24};
float average;

int main() {


    //for loop
    for(auto x: numbers){
        average = average + x;
    }
    cout<<"Average using auto: "<<average/numbers.size()<<endl;

    //for loops
    average = 0.0f;
    for(int i =0; i<numbers.size(); i++){
        average += numbers[i];
    }
    average = average / numbers.size();
    cout<<"Average: "<<average<<endl;

    //while loop
//    vector<int>::iterator ptr = numbers.begin();
    auto ptr = numbers.begin();
    while(ptr != numbers.end()){
        cout<<*ptr<<" ";
        ptr = next(ptr,1);
    }
    cout<<endl;
    int i = 0;
    do{
        cout<<numbers[i]<<" ";
        i++;
    }while(i <numbers.size());

    cout<<endl;
    //switch
    cout <<"Enter operand 1: "<<endl;
    cin >> operand_1;
    cout<<"Enter operand 2:"<<endl;
    cin >> operand_2;
    cout <<"Enter OPeration: + - * / %"<<endl;
    cin >> operation;

    switch (operation) {
        case '+':
            cout <<"Addition: "<<operand_1 + operand_2;
            break;
        case '-':
            cout <<"Subtration: "<<operand_1 - operand_2;
            break;
        case '*':
            cout <<"Multiplication: "<<operand_1 * operand_2;
            break;
        case '/':
            cout <<"Division: "<<operand_1 / operand_2;
            break;
        case '%':
            cout<<"Modulus: "<<(int)operand_1 % (int)operand_2;
            break;
        default:
            cout<<"Invalid operation!";
            break;
    }
    cout<<endl;

    //if else
    if(a > 1000)
        cout<<"Warning: a is over 1000"<<endl;

    if(a % 2 != 0)
        cout<<"a is odd"<<endl;
    else
        cout<<"a is even"<<endl;
    cout<<"The letter is: "<<letter<<endl;
    if(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u')
        cout<<"The letter is a consonant"<<endl;
    else
        cout<<"The letter is a vowel"<<endl;
    return 0;
}
