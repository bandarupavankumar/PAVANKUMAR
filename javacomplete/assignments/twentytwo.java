//22.write a  program to read 5 number from CLA and print omly even number//
class twentytwo{
    public static void main(String[] args){
        for(int i=0;i<=args.length-1;i++){
            if(Integer.parseInt(args[i])%2==0){
                System.out.println(args[i]);
            }
        }
    }
}