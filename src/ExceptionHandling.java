public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr=new int[4];
        try{
            for(int i=0;i<=4;i++) System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
