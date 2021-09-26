//24.write a given program is amrstrong number or not//
class twentyfour{
    public static void main(String[] k){
        int i=153,temp,amrstrong=0;
        int original=n;
        while(n>0){
            temp=temp%10;
            temp=temp*temp*temp;
            amrstrong=amrstrong+temp;
            n=n/10;
        }
        if(amrstrong==original){
            System.out.println("given number is amgstrong number");
        }
        else{
           System.out.println("given number is not amgstrong number"); 
        }
    }
}