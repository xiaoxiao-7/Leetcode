class Solution {
    public boolean isUgly(int n) {
        
        if (n < 1) return false;
        
        while (2*(n/2) == n) {
            n = n/2;
        }
        while (3 * (n/3) == n) {
            n /= 3;
        }
        while (5*(n/5) == n) {
            n /= 5;
        }
        
        return n == 1;
    }
}
