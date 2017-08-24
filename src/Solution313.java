class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] index = new int[len];
        int[] ugly = new int[n];
        
        ugly[0] = 1;
        
        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < len; j++) {
                ugly[i] = Math.min(ugly[i], ugly[index[j]] * primes[j]);
            }
            for (int j = 0; j < len; j++) {
                if (ugly[i] == ugly[index[j]] * primes[j]) index[j]++;
            }
        }
        return ugly[n-1];
    }
}
