cmake_minimum_required(VERSION 3.10)
project(Solution)

set(CMAKE_CXX_STANDARD 11)

#add_executable(TwoSum TwoSum/main.cpp TwoSum/Solution.cpp)
add_executable(addTwoNumbers addTwoNumbers/main.cpp addTwoNumbers/Solution.cpp)

include_directories(${CMAKE_SOURCE_DIR})
