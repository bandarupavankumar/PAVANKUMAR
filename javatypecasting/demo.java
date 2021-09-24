 class p{
    public void show(){
         System.out.println("parent class-method show");
    }
    class c extends p{
        public void show(){
         System.out.println("child class-method show");   
        }
    }
    public static void main(String[] k){
        P p1 = new C();
        p1.show();
    }
 }  