class P{
    public void show(){
      System.out.println("parent-class method show");
    }
}
class C extends P{
    public void show(){
      System.out.println("child-class method show");    
    }
}
class demo{
    public static void main(String[] args){
        P p1 = new C();
        p1.show();
    }
}