public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book();

        book.setTitle("Percy Jackson");
        book.setauthor("Rick Riordan");
        book.setPages(377);

        System.out.println("livro: " + book.getTitle());
        System.out.println("Autor: " + book.getauthor());
        System.out.println("N° de páginas: " + book.getPages());

    }
}
