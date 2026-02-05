    class Person {
    private String name;
    private int age;

    public Person(String n, int a){
        this.name=n;
        this.age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
    class Student extends Person {
    private String major;
    public Student(String n, int a, String m){
        super(n,a);
        this.major = m;
    }
    public String getMajor(){
        return major;
    }
}
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
class Activity2 {
    public static void main(String[] args) {
        Student s = new Student("Reyansh Dereddy",13,"Math");
        Book b = new Book("Harry Potter","J.K. Rowling",563);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getMajor());
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getnumPages());
       


    }
}
