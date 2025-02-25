public class SequencialSearcher
{
    private int[] array = new int[10];

    public SequencialSearcher()
    {
        for (int i = 0; i < 10; i++) 
        {
            array[i] = (int) (Math.random() * 10 + 1);
        }
    }
    
    public static int find(int[] array, int value)
    {
        return value;
    }


}