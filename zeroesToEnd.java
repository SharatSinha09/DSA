public class zeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};

        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                Swap(arr, idx, i);
                idx++;
            }
        }
        //display
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Swap(int[] arr, int idx, int i){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}
