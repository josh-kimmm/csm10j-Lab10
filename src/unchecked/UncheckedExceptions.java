package unchecked;


public class UncheckedExceptions {
    
    public static void ThrowIndexOutOfBounds()
    {
        int arr[] = new int[10];
        System.out.println(arr[10]);
    }
    
    public static void CatchIndexOutOfBounds()
    {
        try
        {
        int arr[] = new int[10];
        System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException aex)
        {
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
    }
    
    public static void CatchIndexOutOfBoundsFinally()
    {
        try
        {
        int arr[] = new int[10];
        System.out.println(arr[9]);
        }
        catch(ArrayIndexOutOfBoundsException aex)
        {
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
        finally
        {
            System.out.println("Finally statement executed");
        }
    }
    
}
