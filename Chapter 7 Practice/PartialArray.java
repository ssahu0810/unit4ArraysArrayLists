public class PartialArray
{
    private int[] values;
    private int currentSize;
    
    public PartialArray()
    {
        // initialise instance variables
        values = new int[100];
        
        for (this.currentSize = 0; this.currentSize < 10; this.currentSize++)
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
    }
    
    public void remove(int pos)
    {
        for (int i = pos + 1; i < this.currentSize; i++)
        {
            this.values[i-1] = this.values[i];
        }
        
        currentSize--;
    }
    
    public void insert(int pos, int value)
    {
        if (this.currentSize < this.values.length)
        {
            if (this.currentSize == value.length)
            {
                this.grow();
            }
            
            
            this.currentSize++;
            for(int i = this.currentSize - 1; i > pos; i--)
            {
                this.values[i] = this.values[i-1];
            }
            this.values[pos] = newValue;
        }
    }
    
    public void swap(int pos1, int pos2)
    {
        if (pos1 < this.currentSize && pos2 < this.currentSize)
        {
            int temp = this.values[pos1];
            this.values[pos1] = this.values[pos2];
            this.values[pos2] = temp;
            
        }
    }
    
    private void grow()
    {
        int[] newValues = new int[this.currentSize * 2];
        
        for (int i = 0;i < this.currentSize;i++)
        {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
        
    }
    
    public static void main(Strign [] args)
    {
        PartialArray myPartialArray = new PartialArray();
        
        myPartialArray.remove(10);
        System.out.println(myPartialArray);
        myPartialArray.insert(17, 45);
        System.out.println(myPartialArray)
        
}
