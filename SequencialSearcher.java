public class SequencialSearcher
{
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

    public static int sum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < 10; i++)
        {
            sum += array[i];
        }
        
        return sum;
    }

    public static int[] even(int[] array)
    {
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            if (array[i] % 2 != 0)
            {
                count ++;
            }
        }

        int[] evenArray = new int[count];
        for (int i = 0; i < 10; i++)
        {
            if (array[i] % 2 != 0)
            {
                evenArray[i] = array[i];
            }
        }

        return evenArray;
    }
}