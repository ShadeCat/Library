import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] bookArray){
        Random random = new Random();
        int lengthOfArray = bookArray.length;
        return bookArray[random.nextInt(lengthOfArray)];
    }

    public void readBook(Book book){
        System.out.println(book.toString());
    }

    public void rateBook(Book book){
        int rating = 0;
        rating += book.getTitle().length() > 0 ? book.getTitle().length() : randomRateDecline();
        rating += book.getAuthor().length() > 0 ? book.getAuthor().length() : randomRateDecline();
        rating += book.getSerialNumber() > 0 ? (-1 * book.getSerialNumber()) : randomRateDecline();
        rating += book.getNumberOfPages();
        String visibleTitle = book.getTitle().length() > 0 ? book.getTitle() : "Без названия";
        System.out.println("Книга: " + visibleTitle + "\nРейтинг: " + rating);
    }

    private int randomRateDecline(){
        Random random = new Random();
        return random.nextInt(100) * -1;
    }
}
