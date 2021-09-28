import java.io.FileInputStream;
class three{
    public static void main(String[] s){
        try{
            System.out.println("one");
           FileInputStream f = new FileInputStream("");
        }
        catch(Exception e){
          System.out.println("two");  
        }
    }
}