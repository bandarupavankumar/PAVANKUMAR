class Emp{
    int Emp_No;
    String Emp_Name;
    Emp(int a,String b){
        this.Emp_No = a;
        this.Emp_Name = b;
        System.out.println("a,b");
    }
    public static void main(String[] args){
              new Emp(101,"pavan");
        
    }
}