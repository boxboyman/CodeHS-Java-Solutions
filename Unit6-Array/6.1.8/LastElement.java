public class LastElement
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"hello", "my name", "world", "Karel"};
        //get and print the last element of the array
        String last = getLastElement(arr);
        System.out.println("The last element of the String array is: " + last);
    }

    public static String getLastElement(String[] arr)
    {
        // Your code goes here!
        return arr[arr.length - 1];
    }
}