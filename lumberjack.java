public class lumberjack {
    public static void main(String[] args) {
        int n = 4;
        int reqW = 7;
        int[] tree = {20,15,10,17};
        System.out.println(cutTreeHeight(n, reqW, tree));
    }
    public static int cutTreeHeight(int n, int reqW, int[] tree){
        int maxH = 0;
        for(int i=0; i<n; i++){
            if(maxH < tree[i]) maxH = tree[i];
        }
        int s = 0;
        int e = maxH;
        int baseH = 0;
        while(s <= e){
            int m = (s+e)/2;
            int wood = 0;
            for(int i=0; i<n; i++){
                if(tree[i] > m){
                    wood+=tree[i]-m;
                }
            }
            if(wood >= reqW){
                baseH = m;
                s=m+1;
            }
            else{
                e = m-1;
            }
        }
        return baseH;
    }
}
