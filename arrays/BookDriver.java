/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
/*Compare To(Object o) {7,9,11,6,8,13,19,15,4}*/
class Book implements Comparable
{
	String name;
    int id;
    double price;

    Book(String bname, int bid, double bprice)
    {
        this.name=bname;
        this.id=bid;
        this.price=bprice;
    }
    public String toString()
    {
        return "Book name = "+name+ "Book id= "+id+",price"+price;
    }
    public int compareTo(Object o)
    {
        Book b=(Book)o;
        if(this.id>b.id)
            return 1;
        else if(this.id<b.id)
            return -1;
        else 
            return 0;
    }
}
import java.util.Arrays;
class BookDriver
{
    public static void main(String[] args) 
    {
        Book b1=new Book("java",420,550);
        Book b2=new Book("c",100,450);
        Book b3=new Book("python",501,499);
        Book b4=new Book("php",200,999);
        Book arr[]={b1,b2,b3,b4};
        System.out.println("before sorting");

        for (int i=0;i<=arr.length-1 ;i++ ) 
        {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("after sorting");
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
}