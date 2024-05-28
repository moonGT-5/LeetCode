#include <iostream>
#include <vector>
#include "Solution.h"

using namespace std;

int main() {
    Solution solution;
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> indices = solution.twoSum1(nums, target);

    if (indices.size() == 2) {
        cout << "Indices: " << indices[0] << ", " << indices[1] << endl;
    } else {
        cout << "No two sum solution found." << endl;
    }

    return 0;
}


