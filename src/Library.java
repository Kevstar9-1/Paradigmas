import java.util.List;

public class Library {

    private List<Book> books;
    private List<Loan> loans;
    private List<Equipment> equipment;

    public Library() {
    }

    /**
     * Constructor for the Library class.
     *
     * @param books     List of books in the library.
     * @param loans     List of loans in the library.
     * @param equipment List of equipment in the library.
     */
    public Library(List<Book> books, List<Loan> loans, List<Equipment> equipment) {
        this.books = books;
        this.loans = loans;
        this.equipment = equipment;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    /**
     * Registers a book in the library.
     *
     * @param book The book to be registered.
     * @return The registered book.
     */
    public Book registerBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Registers a user in the library.
     *
     * @param user The user to be registered.
     * @return The registered user.
     */
    public User registerUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Registers an employee in the library.
     *
     * @param employee The employee to be registered.
     * @return The registered employee.
     */
    public Employee registerEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Borrows a book from the library.
     *
     * @param book    The book to be borrowed.
     * @param user    The user borrowing the book.
     * @return The user who borrowed the book.
     */
    public User borrowBook(Book book, User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Borrows equipment from the library.
     *
     * @param equipment The equipment to be borrowed.
     * @param user      The user borrowing the equipment.
     * @return The user who borrowed the equipment.
     */
    public User borrowEquipment(Equipment equipment, User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Searches for a book based on title, author, and genre.
     *
     * @param title  The title of the book being searched.
     * @param author The author of the book being searched.
     * @param genre  The genre of the book being searched.
     * @return The book being searched for.
     */
    public String searchBook(String title, String author, String genre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Searches for a book based on title.
     *
     * @param title The title of the book being searched.
     * @return The book being searched for.
     */
    public String searchBookByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Searches for a book based on author.
     *
     * @param author The author of the book being searched.
     * @return The book being searched for.
     */
    public String searchBookByAuthor(String author) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Searches for a book based on genre.
     *
     * @param genre The genre of the book being searched.
     * @return The book being searched for.
     */
    public String searchBookByGenre(String genre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
