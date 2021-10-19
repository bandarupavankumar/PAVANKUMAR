import java.util.LinkedList;
import java.util.List;
import java.util.*;
class test{
    public static void main(String[] args){
        LinkedList ll= new LinkedList();
        //List ll  = new LinkedList();
        
        //LinkedList<String> ll  = new LinkedList<String>(); */
        //LinkedList<Integer> ll  = new LinkedList<Integer>();
       

        ll.add("Red");
        ll.add("Blue");
        ll.add(30);
        ll.add(true);
         System.out.println(ll);

        ll.addFirst("Green");
        System.out.println(ll);
        
        System.out.println(ll);
    }
}    
     


      /*  for( object obj:11){

         System.out.println(obj);
        } 
        
            Iterator a=ll.Iterator();
            while(a.hastNext()){
             System.out.println(a.Next());
            }
       */     

     
