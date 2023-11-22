public class BinarySearchCode 
{	
	class binarySearch
	{
		public static int binarysearching(int number[],int key)
		{
			int start = 0, end = number.length -1;
			
			while(start <= end)
			{
				int mid = (start + end)/2;
				if(number[mid] == key)
				{
					return mid;
				}
				if (number[mid] < key) // go right
				{
					start = mid + 1;
				}
				else // go left
				{
					end = mid - 1;
				}
			}
			return -1;
		}
	}
	public static void main(String[] args) 
	{
			int number[] = {2,4,6,8,10,12,14,16};
			int key = 14;
			BinarySearchCode obj = new BinarySearchCode();
			BinarySearchCode.binarySearch obj1 = obj.new binarySearch();
// if class is static then A.B obj1 = new A.B();
// static is used only for inner class 
			int idx = obj1.binarysearching(number, key);
			System.out.println("Key "+key+" at index "+idx);
	}

}