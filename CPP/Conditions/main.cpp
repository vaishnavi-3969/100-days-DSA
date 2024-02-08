#include <iostream>
using namespace std;

int main() {
    int n ;
    cout <<"Enter a number: ";
//    cin >> n;
    n = cin.get();
    cout << "Number entered: "<<" "<< n << endl;
    if(n > 0){
        cout<<"greater than 0";
    }else{
        cout << "less than 0";
    }
}
