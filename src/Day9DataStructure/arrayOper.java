package Day9DataStructure;

public class arrayOper {
    public static void main(String args[]) {
        int []array={6,-12,-50,-4,-5};
        arrSum(array);
        arrMax(array);
        arrMin(array);
        arrRev(array);
    }
    public static void arrSum(int arr[]){
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("the sum of all elements of arrays:"+sum);
    }
    public static void arrMax(int arr[])
    {
        int max=0;
        for(int i=0; i<arr.length;i++)
        {

            if (i==0)
                max=arr[i];
            if (max < arr[i])
                max=arr[i];
        }
        System.out.println("the maximum is: "+max);
    }
    public static void arrMin(int arr[])
    {
        int min=0;
        for(int i=0; i<arr.length;i++)
        {

            if (i==0)
                min=arr[i];
            if (min > arr[i])
                min=arr[i];
        }
        System.out.println("the minimum is: "+min);
    }
    public static void arrRev(int arr[]){
        int i=arr.length ;
        System.out.println("the elements of the array in reverse: ");
        while (i >0)
        {
            i--;
            System.out.print(arr[i]+"  ");
        }
    }
}

