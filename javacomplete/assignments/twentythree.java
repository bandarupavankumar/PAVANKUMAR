//23.write a java program to print Fibonacci number series upto a given number //
class twentythree{
    public static void main(String[] k){
        int N=7;
        int X=0;
        int Y=1;
        int Z;
        System.out.println(X);
        System.out.println(Y);
        for(int i=0;i<=N;i++){
            Z=X+Y;
            System.out.println(Z);
            X=Y;
            Y=Z;
        }


    }
}