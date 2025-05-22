public class FindSubset {

    public static void FindSub(String str , String ans , int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        FindSub(str, ans + str.charAt(i), i+1);
        FindSub(str, ans, i+1);
       
    }
    public static void main(String args[]){
        String str= "abc";
        FindSub(str , "" , 0);
    }
}
