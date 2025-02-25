public class SequencialSearcher
{
    private int[] myArray = new int[10];

    public SequencialSearcher()
    {
        for (int i = 0; i < 10; i++) 
        {
            myArray[i] = (int) (Math.random() * 10 + 1);
        }
    }
    
    public static int find(int[] array, int value)
    {
        for (int i = 0; i < 10; i++)
        {
            if (array[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] array)
    {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++)
        {
            if (array[i] > greatest)
            {
                greatest = array[i];
            }
        }
        return greatest;
    }

    public static int min(int[] array)
    {
        int least = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++)
        {
            if (array[i] < least)
            {
                least = array[i];
            }
        }
        return least;
    }

    public static int[] even(int[] array)
    {
        int[] evenArray = new int[array.length()]
    }
}