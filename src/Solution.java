public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        //不是空数组
        while (i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
                k--;
            } else {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        //有一个数组全部都排完了，只用将另一个数组的剩余部分搬过去
        //如果是nums2排完了则结束，因为本来就要排到nums1中
        //如果是nums1中的元素先用完了，则把nums2中的元素搬移到nums1的开头
        //j代表的就是nums2
        for (int t = 0; t < j + 1; t++) {
            nums1[t] = nums2[t];
        }
    }
}
