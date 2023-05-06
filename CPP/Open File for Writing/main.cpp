#include <iostream>
#include <fstream>
#include <string>

using namespace std;
ofstream outFile;
float a = 4.333f, b = 5.302f;

int main() {
    outFile.open("D:\\github_folder\\100-days-DSA\\CPP\\Open File for Writing\\calculations.txt");
    if(outFile.fail()){
        cout<<endl<<"Couldn't open the file!"<<endl;
    }else{
        outFile<<"a = "<<a<<endl;
        outFile<<"b = "<<b<<endl;
        outFile<<"a+b = "<<a+b<<endl;
        outFile<<"a*b = "<<a*b<<endl;
        outFile.close();
        cout<<"File written successfully!"<<endl;
    }
    return 0;
}
