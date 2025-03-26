class nextPermutation{
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0};
        nextPerm(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    static void nextPerm(int[] arr){
        int n = arr.length;
        int i = n-2;
        while(i >= 0 && arr[i] >= arr[i+1]) i--;
        if(i >= 0){
            int j = n-1;
            while(j >= 0 && arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        replace(arr, i+1, n-1);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void replace(int[] arr, int i, int j){
        while(i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}