    class Book {
    private String title;
    private String author;
    private int numPages;
    public Book(String t, String a, int np){
        this.title = t;
        this.author = a;
        this.numPages = np;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getnumPages(){
        return numPages;
    }
}
class Activity1 {
    public static void main(String[] args) {
        Book b = new Book("Harry Potter","J.K. Rowling",563);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getnumPages());
       


    }
}