// Last updated: 28/08/2025, 15:45:17
/**
 * @param {number[]} nums
 * @return {string}
 */
var triangleType = function(nums) {
    if(!isTriangle(nums)) return "none";
    if(isEquilateral(nums)) return "equilateral";
    if(isIsosceles(nums)) return "isosceles";
    return "scalene";
};

function isTriangle(nums){
    return (
        nums[0] + nums[1] > nums[2] &&
        nums[0] + nums[2] > nums[1] &&
        nums[1] + nums[2] > nums[0] 
    );
}

function isEquilateral(nums){
    return nums[0] === nums[1] && nums[1] === nums[2];
}

function isIsosceles(nums){
    return nums[0] === nums[1] || nums[1] === nums[2] || nums[0] === nums[2];
}