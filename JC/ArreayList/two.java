import java.util.*;
class one{
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("five");
        al.add("six");
        System.out.println(al);
        System.out.println(al.size());

        al.set(5,"Sixteen");
       System.out.println(al);
        System.out.println(al.get(0));




    }
}