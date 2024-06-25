public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch1(nums, target, 1, 4));
    }

    static int linearSearch1(int[] nums, int target, int start, int end) { //To return the index of the target element
        if(nums.length == 0) return -1;
        for(int i = start; i <= end; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }
}
