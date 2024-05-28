cmake_minimum_required(VERSION 3.10)
project(TwoSum)

set(CMAKE_CXX_STANDARD 11)

# Add the executable
add_executable(TwoSum main.cpp Solution.cpp)

# Include the header file
include_directories(${CMAKE_SOURCE_DIR})
