public class Pracctice {
    public static void main(String[] args) {
        String ans = "000000123456900";
        for(int i=0; i<ans.length(); i++){
            if(!(ans.charAt(i)=='0')){
                System.out.println(ans.substring(i,ans.length()));
                break;
            }
        }
    }
}
