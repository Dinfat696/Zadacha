public class BooksAuthors {

    public static void main(String[] args) {

        String [][] booksAuthors={
                {"Книга 1", "Имя 1 Отчество 1 Фамилия 1"},
                {"Книга 2", "Имя 2 Отчество 2 Фамилия 2"},
                {"Книга 3", "Имя 3 Отчество 3 Фамилия 3"}
        };
        for (String [] pair:booksAuthors) {
            String book=pair[0];
            String author=pair[1];

            String format= "\"" + book + "\""+ author;
            System.out.println(format);

        }
    }
}
