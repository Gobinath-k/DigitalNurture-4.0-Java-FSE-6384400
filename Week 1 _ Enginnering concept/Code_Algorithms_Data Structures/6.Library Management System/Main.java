import java.util.ArrayList;
import java.util.List;


public class Main {
    public static Book LinearSearch(List<Book>books,String title){
        for(Book b:books){
            if(b.title.equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }
    public static Book BinarySearch(List<Book>books,String title){
        int l=0,r=books.size()-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int com=books.get(mid).title.compareToIgnoreCase(title);
            if(com==0){
                return books.get(mid);
            }
            else if(com<0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
      List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Data Structures", "Mark Allen"));
        books.add(new Book(102, "Algorithms", "Robert Sedgewick"));
        books.add(new Book(103, "Java Programming", "James Gosling"));
        books.add(new Book(104, "Artificial Intelligence", "Stuart Russell"));
        

        System.out.println("All Books");
        for(Book b:books){

            System.out.println(b);
        }

        System.out.println("Linerseach of book Algorithms ");
        Book result1=LinearSearch(books,"Algorithms");
        System.out.println((result1!=null)?result1:"Book Not Found");

         System.out.println("Binaryseach of book Data Structures ");
        Book result2=LinearSearch(books,"Data Structures");
        System.out.println((result2!=null)?result2:"Book Not Found");
 
    }
}
