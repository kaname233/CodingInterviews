package jz01;
/*
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/*
思路：从矩阵的右上角（左下角）开始匹配，如果比目标值大则往左走，否则往右走
 */
public class JZ01 {
    public boolean Find(int target, int [][] array) {
        int rowLen = array.length;
        int colLen = array[0].length;
        int i = 0;
        int j = colLen -1;
        while(i <= rowLen-1 && j >= 0) {
            if(target > array[i][j]) {
                i++;
            } else if(target < array[i][j]) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}