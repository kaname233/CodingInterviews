package jz09;
/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/*
思路：贪心
 */
public class JZ09 {

    public int JumpFloorII(int target) {
        /*
        第一种方法
        不难得出f(n)=f(n-1)+f(n-2)+f(n-3)+...+f(n-n)，
        反过来就是：f(n)=f(0)+f(1)+...+f(n-1)
         */
        if(target < 1) return 0;
        int[] arr = new int[target+1];
        for (int i = 1; i < target+1; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < target+1; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j];
            }
        }
        return arr[target];
        /*
        第二种方法
        考虑到最后一个台阶必须踩到，而剩下的n-1个台阶任何一个都可以踩或不踩，所以其实就是2**(n-1)
         */

        //return target < 1 ? 0 : (int)Math.pow(2, target -1);
    }


}
