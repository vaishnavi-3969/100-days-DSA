//
// Created by hp on 5/6/2023.
//

#ifndef LEARNING_C___COW_H
#define LEARNING_C___COW_H
#include <string>


enum cow_purpose {dairy, meat, hide, pet};

class cow{
public:
    cow(std::string name_i, int age_i, unsigned char purpose_i);
    std::string get_name();
    unsigned char get_purpose();
    int get_age();
    void set_age(int new_age);
private:
    std::string name;
    int age;
    unsigned char purpose;
};


#endif //LEARNING_C___COW_H
