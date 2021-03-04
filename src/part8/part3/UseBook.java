package part8.part3;

//Данный класс принадлежит пакету bookpackext
public class UseBook {
    public static void main(String[] args) {
        part8.part2.Book books[] = new part8.part2.Book[5];
        books[0] = new part8.part2.Book("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
        books[1] = new part8.part2.Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new part8.part2.Book("Искусство программирования на Java", "Герберт Шилдт", 2005);
        books[3] = new part8.part2.Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new part8.part2.Book("В дороге", "Джек Керуак", 2012);

        for (int i = 0; i < books.length; i++) books[i].show();
    }
}
