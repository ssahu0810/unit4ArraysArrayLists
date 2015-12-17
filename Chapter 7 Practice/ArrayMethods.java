public class ArrayMethods
{
    private int[] values;
    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
    }
    
    public void swapFirstAndLast()
    {
        int first = values[0];
        int last = values[values.length - 1];
        this.values[0] = last;
        values[values.length - 1] = first;
    }
    
    public void shiftRight()
    {
        values[0] = values.[values.length - 1];
        for (int i = values.length - 1; i >= 1; i--)
        {
            values[i] = values[i - 1];
        }
    }
    
    public void zero()
    {
        for (int i = 0; i <= values.length - 1; i ++)
        {
            if (values[i]%2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void changeLarger()
    {
        int newarray[values.length];
        
        for (int i = 1; i <= values.length - 2; i++)
        {
            if {values[i - 1] > values[i + 1])
                newarray[i] = values[i-1];
                
                
         values = newarray;
}