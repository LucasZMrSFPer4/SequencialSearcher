public class SequencialSearcher
{
    public static int find(int[] array, int value)
    {
        for (int i = 0; i < array.length; i ++)
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
        for (int i = 0; i < array.length; i ++)
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
        for (int i = 0; i < array.length; i ++)
        {
            sum += array[i];
        }
        
        return sum;
    }

    public static int[] even(int[] array)
    {
        int count = 0;
        for (int i = 0; i < array.length; i ++)
        {
            if (array[i] % 2 != 0)
            {
                count ++;
            }
        }

        int[] evenArray = new int[count];
        for (int i = 0; i < array.length; i ++)
        {
            if (array[i] % 2 != 0)
            {
                for (int j = 0; j < evenArray.length; j ++)
                {
                    boolean filled = false;
                    if (evenArray[j] == 0 && !filled)
                    {
                        evenArray[j] = array[i];
                        filled = true;
                    }
                }
            }
        }

        return evenArray;
    }
}