public class Floor{
    public static void main(String[] args){
        int[] arr = {-7, -4, 1, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int target = -643548;
        int ans = findCeiling(arr, target);
        System.out.println(ans);
    }

    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end+arr.length];
    }
}