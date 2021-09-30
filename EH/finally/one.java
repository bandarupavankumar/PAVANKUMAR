class Test{
    public static void main(String[] args){
        try{
            String name = null;
            System.out.println(name.length());
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