public class level1q4 {
    public static String  exception(){
        String s="";
        System.out.println(s.length());
        return s; } 
    

    public static String handleexception(){
       String s ="";
       try{
        System.out.println(s.length()); } 

        catch(NullPointerException e){
            System.out.println("nullpointerexception caught" + e.getMessage());
        }
       return s;           
    }

    public static void main(String[] args){
//exception();
handleexception();
    } 
}
