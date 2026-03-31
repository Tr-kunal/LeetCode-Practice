class Solution {
    static int count = 0;

    static void check(int[] arr, int left, int mid, int right) {
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while(j <= right && arr[i] > (long) 2 * arr[j]) j++;
            count += (j - (mid + 1));
        }
    }

    static void merge(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            merge(arr, left, mid);
            merge(arr, mid + 1, right);
            check(arr, left, mid, right);
            mergesort(arr, left, mid, right);
        }
    }

    static void mergesort(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    static int reversePairs(int[] nums) {
        count = 0;
        merge(nums, 0, nums.length - 1);
        return count;
    }
}