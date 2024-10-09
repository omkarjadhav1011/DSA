public class Inserstion {
    public static void main(String args[]) {
    
    }

    public void insertElement(int arr[],int n,int x,int pos) {
        for(int i = n-1; i>=pos;i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = x;
    }
}

