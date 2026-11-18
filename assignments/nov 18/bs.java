public class bs {
     
     public int[] bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;

            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }

        }
        System.out.print("pass"+(i+1)+" :");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        if(!swapped)
        break;
     }
     return arr;}



    public static void main(String[] args) {
        int arr[]={42,17,35,8,26};
        bs obj=new bs();
        obj.bubbleSort(arr);
        System.out.println("sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // Your Code goes here!

    }
}