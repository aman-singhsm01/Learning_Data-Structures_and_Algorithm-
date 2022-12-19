package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 0, 2};
        int ans = rotationCount(arr)+1;
        System.out.println(ans);
    }

    static int rotationCount(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}