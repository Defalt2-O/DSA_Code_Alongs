public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {-9, -5, -3, 1, 5, 8, 13, 17, 27, 57 ,78};
        int target = 17;
        int ans = binSearch(arr, target);
        System.out.println(ans);
    }

    static int binSearch(int[] arr, int target) { //return index of element
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}