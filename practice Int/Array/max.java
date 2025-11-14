public class max {
  public static void main(String[] args) {
      int[] arr={10,20,90,40,70};

      int min=arr[3];

      for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
           min=arr[i];
        }
      }
        System.out.println("minmum number:="+min);



  }

}
