//Linear search
//find the index of element in a given array
//                      key = 10
// 2,4,5,86,64,39,19,03,10,34,45

public class ArrayLinerSearch
{
    public static int linearSearch(int number[], int key)
    {
        for(int i=0; i<number.length; i++)
        {
            if(number[i]== key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 8;
        int index = linearSearch(number, key);

        if(index == -1)
        {
            System.out.println("key Not Found!");
        }
        else
        {
            System.out.println("key "+key+" at index: "+ index);

        }
    }
}