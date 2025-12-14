public class Del {
  public static void main(String[] args) {
      int[] arr={10,20,30,40,50,60,70};
      int index=3;

      for(int i=index;i<arr.length-1;i++){
        arr[i]=arr[i++];
      }
      System.out.println("Array After deletion:");
      for(int i=0;i<arr.length-1;i++){
        System.out.println(arr[i]+" ");
      }

  }

}
