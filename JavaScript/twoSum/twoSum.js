/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const number = [];
  const size = nums.length;
  let seach = true;
  for (let i = 0; i < size && seach; i++) {
    for (let j = 0; j < size && seach; j++) {
      if (j !== i) {
        if (nums[i] + nums[j] == target) {
          number.push(i);
          number.push(j);
          seach = false;
        }
      }
    }
  }
  return number;
};
