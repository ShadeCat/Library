public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Лука Мудищев", "И. Барков", 12, 50);
        Book book2 = new Book(50);
        Book book3 = new Book(34, 53);
        Book book4 = new Book("Анонимус", 100, 500);
        Book[] testBookArray = {book1, book2, book3, book4};
        Reader testReader = new Reader();
        Book testSelectedBook = testReader.choiceBook(testBookArray);
        testReader.readBook(testSelectedBook);
        testReader.rateBook(testSelectedBook);
    }
}
