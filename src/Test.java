public class Test {
    public static void main(String[] args) {
        int n=2; int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) flag++;
        }
        if(flag>0) System.out.println("not a prime");
        else System.out.println("prime");
    }
}
