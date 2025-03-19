class shuffleStr{
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i=0; i<indices.length; i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);

        // StringBuilder res = new StringBuilder();
        // HashMap<Integer, Character> mp = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     mp.put(indices[i], s.charAt(i));
        // }
        // for(int i=0; i<s.length(); i++){
        //     res.append(mp.get(i));
        // }
        // return res.toString();
    }
}