#include <unordered_map>
#include "Solution.h"

using namespace std;

//8ms 12.73m
vector<int> Solution::twoSum1(vector<int> &nums, int target) {
    vector<int> index(nums.size());
    for (int i = 0; i < nums.size(); i++) {
        index[i] = i;
    }
    sort(index.begin(), index.end(), [&nums](int a, int b) { return nums[a] < nums[b]; });

    vector<int> result(2);
    int left = 0, right = nums.size() - 1;
    while (left < right) {
        int sum = nums[index[left]] + nums[index[right]];
        if (sum == target) {
            result[0] = index[left];
            result[1] = index[right];
            break;
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return result;
}
//13ms 13.72m
vector<int> Solution::twoSum2(vector<int>& nums, int target) {
    vector<int> result(2);
    unordered_map<int, int> map;
    for (int i = 0; i < nums.size(); i++) {
        int temp = target - nums[i];
        if (map.find(temp) != map.end()) {
            result[0] = map[temp];
            result[1] = i;
            return result;
        }
        map[nums[i]] = i;
    }
    return result;
}
