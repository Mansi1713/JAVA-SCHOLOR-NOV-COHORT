
public class Progarm8 {

		
		static boolean isMirrorInverse(int arr[])
	    {
	        for (int i = 0; i < arr.length; i++) {
	 
	            // If condition fails for any element
	            if (arr[arr[i]] != i)
	                return false;
	        }
	 
	        // Given array is mirror-inverse
	        return true;
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int arr[] = { 1, 1, 1, 0 };
	        if (isMirrorInverse(arr))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
	}
