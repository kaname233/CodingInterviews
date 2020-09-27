package jz07;
/*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
n<=39
 */

/*
思路：1. 递归
     2. 迭代
 */
public class JZ07 {
    /* 递归法:运行速度800ms
    public int Fibonacci(int n) {
        if(n <= 1) return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    */

    //迭代法：迭代次数为n-1次
    //运行速度：10ms
    public int Fibonacci(int n) {
        if(n <= 1) return n;
        int a = 0;
        int b = 1;
        for(int i = 0; i < n -1; i++) {
            int tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }

}
