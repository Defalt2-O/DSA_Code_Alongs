public class Main{
    public static void main(String[] args) {
        int[] nums = {51, 98, 47, 54, 36 ,15 ,27, 94 , 6, 74};
        int target = 66;
        System.out.println(linearSearch1(nums, target));
        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));
    }

    static int linearSearch1(int[] nums, int target) { //To return the index of the target element
        if(nums.length == 0) return -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }

    static int linearSearch2(int[] nums, int target) {//To return the target element, but if -1 is returned, we don't know if the target element is not present or it is found at some index
        if(nums.length == 0) return -1;
        for(int num:nums){
            if(num == target) return num;
        }
        return -1;
    }
    static boolean linearSearch3(int[] nums, int target) {//Return true if the target element is present, else false. This way even -1 can be returned and we can know that the target element is present
        if(nums.length == 0) return false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return true;
        }
        return false;
    }
}