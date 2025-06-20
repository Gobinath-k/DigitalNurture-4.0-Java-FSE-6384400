class Book{
    int bookId;
    String title;
    String author;
     Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
     }

     @Override
     public String toString(){
        return "Books= [ bookId= "+bookId+", titile= "+title+", author= "+author+"]";
     }
}