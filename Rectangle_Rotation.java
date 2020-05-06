class Solution {

    static int rectangleRotation(final int a, final int b) {
    
        int sqrtA = (int) Math.floor(a / Math.sqrt(2));
        int sqrtB = (int) Math.floor(b / Math.sqrt(2));
        
        if (sqrtA % 2 != 0 ^ sqrtB % 2 != 0) {
            return (sqrtA + 1) * (sqrtB + 1) + sqrtA * sqrtB - 1;    
        }
        
        return (sqrtA+1) * (sqrtB+1) + sqrtA * sqrtB;
    }
}
