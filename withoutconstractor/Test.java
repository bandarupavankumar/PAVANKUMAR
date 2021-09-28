class Test{
    String Message;
    public void set Message(String Message){
        Message=New Message;
    } 
    public String get Message(){
        return Message;
    }
    public static void main(String[] args){
        Test s=new Test();
        s.set Message(Hello,Good moring);
        System.out.println("s.Message");
        System.out.println("s.get Message");
    }
}