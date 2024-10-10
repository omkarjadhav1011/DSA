public class Inserstion {
    public static void main(String args[]) {
      int arr[] = {1,2,3,5,6,7,9,0};

      // function calling
      insertElement(arr,7,10,4);

      // Printing new array
      for(int i=0 ; i<=arr.length;i++) {
        System.out.println(arr[i]+" ");
      }

      System.out.println(arr.getClass());
    }

    public static void insertElement(int arr[],int n,int x,int pos) {
        for(int i = n-1; i>=pos;i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = x;
    }
}

