public class Test1 {
    public static void main(String[] args) {
        String s1="TATA";
        String s2="STRIVE";
        String p1="";
        String p2="";
      int a=0,b=0;
      for(int i=0;i<=7;i++){
          for(int j=0;j<=i/8;j++){
              System.out.print(p1+p2);
          }
          if(a<4){
              p1+=s1.charAt(a);
              a++;
          }
          if(b<6 && a>1){
              p2+=s2.charAt(b);
              b++;
          }
          System.out.println();
      }
    }
}
