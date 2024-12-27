public class Search {
    public static void main(String[] args) {
        int[] arr={12,50,90,45,84,99};
        int max=0,min=arr[0];
        System.out.println("the array is ");
        for(int i:arr){
            System.out.print(i+" ");
            if(i>max) max=i;
            if(i<min)  min=i;
        }
        System.out.println("\nmaximum no. is "+max);
        System.out.println("minimum no. is "+min);
    }
}
