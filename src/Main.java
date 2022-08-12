public class Main {
    public static void main(String[] args) {

        System.out.println("Hello SkyPRO!");

        Author fet = new Author("Афанасий", "Фет");
        Book butterfly = new Book("Бабочка", fet ,1884);
        System.out.println("Название книги: " + butterfly.getTitle() + "; " + butterfly.getAuthor() +  "; Год издания: " + butterfly.getYear());
        butterfly.setYear(1900);
        System.out.println("Название книги: " + butterfly.getTitle() + "; " + butterfly.getAuthor() +  "; Год издания: " + butterfly.getYear());
        System.out.println("butterfly = " + butterfly);


        Author pushkin = new Author("Александр", "Пушкин");
        Book evgeniyonegin = new Book("Евгений Онегин", pushkin,1830);
        System.out.println("Название книги: " + evgeniyonegin.getTitle() + "; " + evgeniyonegin.getAuthor() +  "; Год издания: " + evgeniyonegin.getYear() );
        evgeniyonegin.setYear(1833);
        System.out.println("Название книги: " + evgeniyonegin.getTitle() + "; " + evgeniyonegin.getAuthor() +  "; Год издания: " + evgeniyonegin.getYear() );


    }
}