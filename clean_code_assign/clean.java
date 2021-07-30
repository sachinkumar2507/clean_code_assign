public class clean
{
    static class findingNumbers//static class//
    {
    
    int SmallestNumber; //initializing variable//
    int LargestNumber; 
    }
    
    static findingNumbers MAX_MIN_number(int GivenArray[], int SizeOfArray)  //Method to Find Max number And min. number//
    {
        findingNumbers objectOfclass = new findingNumbers();
        
        int i;
        
        if (SizeOfArray == 1)
        {
            objectOfclass.LargestNumber = GivenArray[0];
            objectOfclass.SmallestNumber = GivenArray[0];
            return objectOfclass;
        }
        
        if (GivenArray[0] > GivenArray[1]) 
        {
            objectOfclass.LargestNumber = GivenArray[0];
            objectOfclass.SmallestNumber = GivenArray[1];
        } 
        else 
        {
            objectOfclass.LargestNumber = GivenArray[1];
            objectOfclass.SmallestNumber = GivenArray[0];
        }
        
        for (i = 2; i < SizeOfArray; i++) 
        {
            if (GivenArray[i] > objectOfclass.LargestNumber) 
            {
                objectOfclass.LargestNumber = GivenArray[i];
            }
            else if (GivenArray[i] < objectOfclass.SmallestNumber)
            {
                objectOfclass.SmallestNumber = GivenArray[i];
            }
        }
    
        return objectOfclass;
    }
    
    public static void main(String args[]) //Main method//
    {
        int GivenArray[] = {1000, 11, 445, 1, 330, 3000}; //initialising Array//
        int LengthOfArray = 6;
        findingNumbers objectOfCheck = MAX_MIN_number(GivenArray, LengthOfArray); // passing value to function//
        System.out.printf("\n Smallest Number : %d", objectOfCheck.SmallestNumber);
        System.out.printf("\n Largest Number : %d", objectOfCheck.LargestNumber);
    }
}
