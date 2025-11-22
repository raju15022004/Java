// package practice Int.Array;

public class Sum {
  public static void main(String[] args) {
      int[] arr={2,7,4,5,9,1,3};
      int sum=3;

      System.out.println("jodiya jinka total"+sum+"hai");

      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==sum){
            System.out.println(arr[i]+"+"+arr[j]+"="+sum);
          }
        }
      }
  }

}







