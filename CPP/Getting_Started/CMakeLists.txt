cmake_minimum_required(VERSION 3.24)
project(Getting_Started)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(Getting_Started
        main.cpp
        main.h)
