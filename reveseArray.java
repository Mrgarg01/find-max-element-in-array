public class reveseArray {
    public static void main(String[] args) {
        int arr[]= new int[]{10,20,30,40};
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i= arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
