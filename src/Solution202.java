class Solution202 {
    public boolean isHappy(int n) {
        if (n < 1) return false;
        
        HashSet<Integer> map = new HashSet<Integer>();
        
        while (n != 1 && !map.contains(n)) {
            map.add(n);
            
            int tmp = 0;
            int newN = 0;
            while (n > 0) {
                tmp =n % 10;
                newN += tmp * tmp;
                n /= 10;
            }
            n = newN;
            
        }
        return n == 1;
    }
}

#Use HashSet
