#include <iostream>
#include <vector>
#include "Solution.h"

int main() {
    Solution solution;
    std::vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    std::vector<int> indices = solution.twoSum(nums, target);

    if (indices.size() == 2) {
        std::cout << "Indices: " << indices[0] << ", " << indices[1] << std::endl;
    } else {
        std::cout << "No two sum solution found." << std::endl;
    }

    return 0;
}


