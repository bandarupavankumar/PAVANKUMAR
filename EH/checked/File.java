import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class File{
    public static void main(String[] s){
        try{
            FileOutputStream fos = new FileOutputStream("d:/abc.txt");
        }
        catch(FileNotFoundException pavan){

        }
        catch(Exception e){
            
        }
    } 
}