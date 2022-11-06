package Applications;

import java.util.HashMap;

public class DynamicProgramming {
    /* 
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Example:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    */
    public int climbStairs(int n) {
        // Create a memoization of the call function to avoid repeated
        // stair calls and reduce time complexity
        HashMap<Integer, Integer> memo = new HashMap<>();

        // Base case, if 0 is reached, the call stack is valid, if it is
        // exceeded (negative value), then it is not valid
        if(n == 0) return 1;
        if(n < 0) return 0;

        // Add values to map and compute them simultaneously
        memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));

        // Return the accumulation of ways
        return memo.get(n);
    }

    private int climbStairs(int n, HashMap<Integer, Integer> memo) {

        // If the call stack has already been processed and is present in
        // the map, retrieve the value to avoid unnecessary repeats
        if(memo.containsKey(n)) return memo.get(n);

        // Base case, if 0 is reached, the call stack is valid, if it is
        // exceeded (negative value), then it is not valid
        if(n == 0) return 1;
        if(n < 0) return 0;

        // Add values to map and compute them simultaneously
        memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));

        // Return the accumulation of ways
        return memo.get(n);
    }

    public static void main(String[] args) {
        DynamicProgramming init = new DynamicProgramming();

        System.out.println(init.climbStairs(2) + " steps");
        System.out.println(init.climbStairs(8) + " steps");
        System.out.println(init.climbStairs(10) + " steps");
        System.out.println(init.climbStairs(11) + " steps");
        System.out.println(init.climbStairs(40) + " steps");
    }
}
