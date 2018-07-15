package array;

/**
 * 27. Remove Element
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i =0 ; i < length; i++){
            if (nums[i] == val){
                for (int j = i; j < length - 1; j++){
                    nums[j] = nums[j + 1];
                }
                //防止要移除的元素是相邻的两个数
                i--;
                //防止数组下标越界
                length--;
            }
        }
        return length;
    }
}
