#include <iostream>
#include <string>
#include <fstream>

using namespace std;
ifstream inFile;
string str;
int number;
char letter;

int main() {
    inFile.open("D:\\github_folder\\100-days-DSA\\CPP\\File IO\\people.txt");
    if(inFile.fail()){
        cout<<endl<<"File not found!"<<endl;
    }else{
        //eof -> end of file
        while(!inFile.eof()){
            getline(inFile, str);
            cout<<str<<", ";
            getline(inFile,str);
            number = stoi(str);
            cout << number << ", ";
            getline(inFile,str);
            letter = str[0];
            cout <<letter<<endl;
        }
        inFile.close();
    }
    return 0;
}
