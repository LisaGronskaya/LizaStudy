package part8.part5;

//Пример использования модификатора доступа protected
class ExtBook extends part8.part4.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int d) {
        pubDate = d;
    }
}

class ProtectedDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];
        books[0] = new ExtBook("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018, "Вильямс");
        books[1] = new ExtBook("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018, "Вильямс");
        books[2] = new ExtBook("Искусство порграммирования на Java", "Герберт Шилдт", 2003, "Диалектика");
        books[3] = new ExtBook("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
        books[4] = new ExtBook("В дороге", "Джек Керуак", 2012, "Азбука");

        for (int i = 0; i < books.length; i++) books[i].show();

        System.out.println("Все книги Герберта Шилдта.");
        for (int i = 0; i < books.length; i++)
            if (books[i].getAuthor() == "Герберт Шилдт")
                System.out.println(books[i].getTitle());
    }
}

