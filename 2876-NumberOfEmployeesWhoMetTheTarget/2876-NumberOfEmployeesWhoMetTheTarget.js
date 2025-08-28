// Last updated: 28/08/2025, 15:45:18
/**
 * @param {number[]} hours
 * @param {number} target
 * @return {number}
 */
var numberOfEmployeesWhoMetTarget = function(hours, target) {
    let count = 0;
    for(let hour of hours){
        if(hour >= target) count++;
    }
    return count;
};