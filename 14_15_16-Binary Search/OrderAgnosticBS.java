public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {78, 57, 27, 17, 13, 8, 5, 1, -3, -5, -9};
        int target = 17;
        int ans = binSearch(arr, target);
        System.out.println(ans);
    }

    static int binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
