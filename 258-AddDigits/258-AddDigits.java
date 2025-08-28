// Last updated: 28/08/2025, 15:45:32
class Solution {
    public int addDigits(int num) {
        
        if(num != 0) {
            while (num > 0){
                int n1 = num % 10;
                int n2 = (num - n1) / 10;

                if(n1+n2 < 10)
                    return n1+n2;
                else
                    num = n1+n2;
            }
        }

        return 0;
    }
}