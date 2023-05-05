//
// Created by vaishnavi on 5/6/2023.
//

#include "cow.h"

cow::cow(std::string name_i, int age_i, unsigned char purpose_i){
    name = name_i;
    age = age_i;
    purpose = purpose_i;
}
std::string cow::get_name(){
    return name;
}
unsigned char cow::get_purpose(){
    return purpose;
}
int cow::get_age(){
    return age;
}
void cow::set_age(int new_age){
    age= new_age;
}