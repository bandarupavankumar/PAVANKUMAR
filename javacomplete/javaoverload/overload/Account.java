class Account{
    public double get_Balance(double amount){
        System.out.println("method-1");
        return 1500.00;
    } 
    public int get_Balance(int a){
      System.out.println("method-2");
      return 1500;
    }
    public void get_Balance(){
        System.out.println("method-3");
    }
    public static void main(String[] args){
        Account a = new Account(1);
        a.get_Balance();
    }
}