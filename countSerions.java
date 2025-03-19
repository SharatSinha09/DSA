//Leetcode 2678
public class countSerions {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    public static int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            String age = details[i].substring(11,13);
            if(Integer.parseInt(age) > 60){
                count++;
            }
        }
        return count;
    }
}
