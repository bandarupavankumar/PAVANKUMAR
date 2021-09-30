class Test{
    public static void main(String[] args){
        try{
             int a=100,b=0,c;
             c=a/b;
             System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();             
        }
        finally{

         System.out.println("finally block allow");   
        }
    }
}