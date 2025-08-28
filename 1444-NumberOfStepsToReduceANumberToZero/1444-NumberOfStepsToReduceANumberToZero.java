// Last updated: 28/08/2025, 15:45:25
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if(num % 2 == 0) num /= 2;
            else num--;
            steps++;
        }
        return steps;
    }
}