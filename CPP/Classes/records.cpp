//
// Created by hp on 5/6/2023.
//

#include <string>
#include "records.h"

using namespace std;

Student::Student(int id, name){
    id = id;
    name = name;
}
int Student::get_id(){
    return id;
}
string Student::get_name(){
    return name;
}

Course::Course(int id, string name, unsigned char credits){
    id = id;
    name = name;
    credits = credits;
}
int Course::get_id(){
    return id;
}
string Student::get_name(){
    return name;
}
Course::Course(int id, string name, unsigned char credits){
    id=id;
    name=name;
    credits=credits;
}
int Course::get_id(){
    return id;
}
string Course::get_name(){
    return name;
}
unsigned char Course::get_credits(){
    return credits;
}