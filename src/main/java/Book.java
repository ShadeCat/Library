public class Book {
    private String title; // Кажется что читатель не должен иметь доступ к измененю,
    private String author; // но final не ставлю на случай что придёт библиотекать и сеттеры делать придётся
    private int serialNumber;
    private int numberOfPages;

    Book(String title, String author, int serialNumber, int numberOfPages){
        this.title = title != null ? title : "";
        this.author = author != null ? author : "";
        this.serialNumber = validate(serialNumber);
        this.numberOfPages = validate(numberOfPages);
    }

    Book(String author, int serialNumber, int numberOfPages){
        this.title = "";
        this.author = author != null ? author : "";
        this.serialNumber = validate(serialNumber);
        this.numberOfPages = validate(numberOfPages);
    }

    Book(int serialNumber, int numberOfPages){
        this.title = "";
        this.author = "";
        this.serialNumber = validate(serialNumber);
        this.numberOfPages = validate(numberOfPages);
    }

    Book(int numberOfPages){
        this.title = "";
        this.author = "";
        this.serialNumber = 0;
        this.numberOfPages = validate(numberOfPages);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


    @Override
    public String toString() {
        String message = "";
        if (!this.title.equals("")){
            message += "Книга:" + title + "\n";
        }
        if (!this.author.equals("")){
            message += "Автор: " + author + "\n";
        }
        if (this.serialNumber != 0){
            message += "Серийный номер: " + serialNumber + "\n";
        }
        message += "Количество страниц: " + numberOfPages;
        return message;
    }

    private static int validate(int number){
        if (number <= 0){
            throw new IllegalArgumentException("Аргумент должен быть положительным целым числом");
        }
        return number;
    }
}
