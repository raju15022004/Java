public class max {
  public static void main(String[] args) {
      int[] arr={10,20,90,40,70,80,90,50};

      int min=arr[1];



      for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
           min=arr[i];
        }
      }
        System.out.println("minmum number:="+min);



  }

}
