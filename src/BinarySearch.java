public class BinarySearch {
    public static void main(String[] args) {
        int[] a=new int[] {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<a.length;i++) {
            System.out.print(a[i] + " " /* ,binarySearch(a, 10)*/);
        }

        System.out.println("\n"+binarySearch(a, 8));

    }
    public static int binarySearch(int [] a, int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=low+(high-low) / 2;
            if( key < a[mid] ){
                high=mid-1;
            } else if (key > a[mid]) {
                low=mid+1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}