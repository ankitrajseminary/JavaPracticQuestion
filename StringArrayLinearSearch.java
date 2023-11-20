public class StringArrayLinearSearch 
{
    public static String searchItem(String foodString[], String item)
    {
        for(int i = 0; i<foodString.length; i++)
        {
            if(foodString[i] == item)
            {
                return foodString[i];
            }
        }
        return foodString[9];
    }
    //main block
 public static void main(String[] args) 
 {
    String foodMenu[] = {"momo","samosha","egg roll","idly","litee","pani puri"};
    String item = "cooc";
    String index = searchItem(foodMenu,item);
    if(index == item)
    {
        System.out.println("item available");
    }
    else
    {
        System.out.println("item Not found");
    }
 }   
}
