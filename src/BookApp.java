public class BookApp {
    public static void main(String[] args) {
        //instantiate book using default constructor
        Book b = new Book();
        b.setAuthor("Homer");
        b.setTitle("The Iliad");
        b.setDescription("Achilles is low-key sensitive");
        //instantiate book
        Book b2 = new Book("The Odyssey", "Homer", "Note to self: avoid pissing off Poseidon");
        System.out.println(b.getDisplayText());
        System.out.println(b2.getDisplayText());

    }
}
