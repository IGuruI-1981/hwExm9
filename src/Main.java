public class Main {
    public static void main(String[] args) {

        System.out.println("Hello SkyPRO!");

        Author fet = new Author("Афанасий", "Фет");
        Book butterfly = new Book("Бабочка", fet.toString(),1884);
        System.out.println("Название книги: " + butterfly.getTitle() + "; " + butterfly.getAuthor() +  "; Год издания: " + butterfly.getYear());
        butterfly.setYear(1900);
        System.out.println("Название книги: " + butterfly.getTitle() + "; " + butterfly.getAuthor() +  "; Год издания: " + butterfly.getYear());


        Author pushkin = new Author("Александр", "Пушкин");
        Book evgeniyonegin = new Book("Евгений Онегин", pushkin.toString(),1830);
        System.out.println("Название книги: " + evgeniyonegin.getTitle() + "; " + evgeniyonegin.getAuthor() +  "; Год издания: " + evgeniyonegin.getYear() );
        evgeniyonegin.setYear(1833);
        System.out.println("Название книги: " + evgeniyonegin.getTitle() + "; " + evgeniyonegin.getAuthor() +  "; Год издания: " + evgeniyonegin.getYear() );


    }
}