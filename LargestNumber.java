public class LargestNumber 
{   
    public static int largeNumber(int number[], int largest)
    {
        for(int i=0; i<number.length; i++)
        {
            if(number[i] > largest)
            {
                largest = number[i];
            }
        }
         return largest;
    }
    
    public static int smallNumber(int number[], int smallest)
    {
        for(int i=0; i<number.length; i++)
        {
            if (number[i]< smallest) {
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args)
    {
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        int Number[] = {1,3,2,400,6,33,23,65};

        //large number find
        int lvalue = largeNumber(Number, largest);
        System.out.println("The largest number : "+lvalue);
        
        //small number find
        int svalue = smallNumber(Number, smallest);
        System.out.println("The smallest number : "+svalue);
    }    
}
