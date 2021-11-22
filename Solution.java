//Justin Butler
// 11/22/2021
class Solution {
    public int integerReplacement(int n) {
        if(n==1){return 0;}
        //Initiate a recursive sequence until n ==1.
        if(n%2==0){return integerReplacement(n/2)+1;}
        // No given range bounds on minus, so it comes first.
        int minus = integerReplacement(n-1)+1;
        int plus = minus; // Range 1 -> 2147483647.
        if(n!=2147483647){plus = integerReplacement(n+1)+1;}
        else{plus--;}
        return Math.min(plus, minus);
        
    }
}
