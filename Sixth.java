import java.util.*;

class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}

class Book {
    String title;
    double price;
    Author author;

    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                "\nPrice: " + (int)price +
                "\nAuthor: " + author.name +
                " (" + author.gender + "), Email: " +
                author.email;
    }
}

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        Author a = new Author(
                data[2],
                data[3],
                data[4].charAt(0)
        );

        Book b = new Book(
                data[0],
                Double.parseDouble(data[1]),
                a
        );

        System.out.println(b);
    }
}