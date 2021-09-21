public class Author {
    String Name;
    String Email;
    String Gender;
    String Book;

    Author(String name, String email, String gender, String book) {
        this.Name = name;
        this.Email = email;
        this.Gender = gender;
        this.Book = book;
    };

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Gender: " + Gender);
        System.out.println("Book: " + Book);
    }

    public static void main(String args[]) {
        Author obj = new Author("Hanzala Hashmi", "cs201143@gmail.com", "male", "Elite");
        obj.display();
    }
};