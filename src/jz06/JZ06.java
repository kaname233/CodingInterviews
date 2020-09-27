package jz06;
/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组[3,4,5,1,2]为[1,2,3,4,5]的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 */

/*
思路： 二分法
 */
public class JZ06 {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0) return 0;
        int left = 0; int right = len -1; int mid = 0;
        while(array[left] >= array[right]) {
            if(right - left == 1) {
                mid = right;
                break;
            }
            mid = left + (right - left) / 2;
            //array[mid]、array[left]、array[right]三者相等时，
            // 无法判断中间元素属于前面还是后面的递增子数组
            // 只能顺序查找
            if(array[mid] >= array[left]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }
}
