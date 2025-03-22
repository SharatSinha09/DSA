public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};

        int sMax = -1;
        int Max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > Max){
                sMax = Max;
                Max = arr[i];
            }
            if(arr[i] > sMax && arr[i] < Max){
                sMax = arr[i];
            }
        }
        System.out.println(sMax);
    }
}
