public class ArrayOps {
   public static void main(String[] args) {
     /*   
       

int[]arrx= {3,0,1,9,10,22};
int[]arrxx={3,0,1,9,10,22,3,3,3,22,0,0};
int[]arrxxx= {0,1,2,3,4,2};
int[]arr1= {3,0,1};


printArray(arrx) ;
printArray(arrxx);
printArray(arrxxx);
System.out.println(containsTheSameElements(arrx, arrxx));
System.out.println(findMissingInt(arr1));
System.out.println(secondMaxValue(arrx));
System.out.println(isSorted(arrxxx));

*/


    }
//#1
    public static int findMissingInt (int [] arr) {
        int count = 0;
        int k = 0;
        if ( arr.length == 1 ) 
        {
            return 1;
        }
        for ( int i = 0; i < arr.length; i++)
        {
            count = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] == i) 
                    count++;
            }
            if (count == 0)
                 k = i;
        }
        return k;
    }
     
//#2

public static int secondMaxValue(int[] arr) {
    int count = 0;
    int max1 = arr[0];
    int max2 = arr[0];

    if (arr.length == 1) {
        return arr[0];
    }

    for (int i = 0; i < arr.length; i++) 
    {
        if (arr[i] >= max1) {
            max1 = arr[i];
        }
    }

  
    for (int j = 0; j < arr.length; j++) 
    {
        if ((arr[j] >= max2) && (arr[j] != max1)) {
            max2 = arr[j];
        }
        if (arr[j] == max1) {
            count++;
        }
    }

    if (count > 1) 
    {
        return max1;
    }

  
    return max2;
}

//#3
public static boolean containsTheSameElements(int[] arr1, int[] arr2) {
    int count = 0;
    boolean equal = true;

    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                count++;
            }
        }

        if (count == 0) {
            equal = false;
        }

        count = 0;
    }

    return equal;
}


//#4

public static boolean isSorted(int[] arr) {
    int countIncreasing = 0;
    int countDecreasing = 0;

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] <= arr[i + 1]) {
            countIncreasing++;
        }
        if (arr[i] >= arr[i + 1]) {
            countDecreasing++;
        }
    }

    if (countIncreasing == arr.length - 1 || countDecreasing == arr.length - 1) 
    	{
        return true;
    } 
    else 
    	{
        return false;
    }
}




        
    }