#include <iostream>
#include "records.h"
using namespace std;
Student my_student(1,"Hilda Jonas");
Course my_course(3,"Physics 101",3);
Grade my_grade(1,3,'B');

int main() {
    cout<<"Student: "<<my_student.get_name()<<endl;
    cout<<"Course: "<<my_course.get_name()<<endl;
    cout<<"Credits: "<<my_course.get_credits()<<endl;
    cout<<"Grade: "<<my_grade() <<endl;
    return 0;
}
