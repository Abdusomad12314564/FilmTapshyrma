import javax.xml.namespace.QName;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Kurmanjan Datka", 2014, "Taryhty chagylrygan kyrgyz kinosu", new Director("Sadyk", "SherNiyaz"),
                List.of(new Cast("Aziz Muradaliev", "Alymbek Datka"),
                        new Cast("Elina Abai Kyzy", "Kurmanjan Datka"),
                        new Cast("Ulan Omuraliev", "Shabdan"))));
        movies.add(new Movie("Boz Salkyn", 2007, "Tagdyry bashka jigitke bailangan kyz tuuraluu", new Director("Ernest", "Abdyjaparov"),
                List.of(new Cast("Asem Toktobekova", "Asema"),
                        new Cast("Tynchtyk Abylkasymov", "Sagyn"),
                        new Cast("Siezdbek Iskenaliev", "Murat"))));
        movies.add(new Movie("Salam New York", 2013, "New Yorkko baryp ar kandai kyiynchylykka tush bolgon jigit tuuraluu", new Director("Ruslan", "Akun"),
                List.of(new Cast("Bektemir Mamayusupov", "Batyr"),
                        new Cast("Bakyt Mukul", "Akim"),
                        new Cast("Alex Galper", "Chess Player"))));
        movies.add(new Movie("Kok Boru", 2018, "Kyrgyzdyn uluttuk oiunu Kok Boru tuuraluu", new Director("Ruslan", "Akun"),
                List.of(new Cast("Emil Esenaliev", "Mairambek"),
                        new Cast("Asylkhan Tolypov", "Maksat"),
                        new Cast("Taalaikan Abazova", "Jarkyn"))));
        movies.add(new Movie("Do+Fa", 2012, "Muzyka suiuuchulor uchun jana suiuugo toibogondor uchun film", new Director("Ernest", "Abdyjaparov"),
                List.of(new Cast("Emil Esenaliev", "Emil"),
                        new Cast("Cholponai Kenjekulova", "Farida"),
                        new Cast("Samat Erkinbaev", "Dooron"))));

        Movie movie = new Movie() {
            @Override
            public List<Movie> getAllMovies(List<Movie> movies) {
                return super.getAllMovies(movies);
            }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ===========Catalog==========
                1- Baardyk filmderdi chygarat.
                2- Filmdi aty menen izdet.
                3- Acterdun aty menen izdet.
                4- Filmdi jyly menen izdet.
                5- Direktordun aty menen izdeit.
                6- Filmde jazylgan opisaniya boyuncha izdet.
                7- Filmdegi rol oinogondordun aty menen izdet.
                8- Filmdi aty menen iretteit.
                9- Filmdi jyly menen iretteit.
                10- Filmdi direktordun aty menen iretteit.""");
        while (true) {
            System.out.print("\nNomer jazynyz: ");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> movies.forEach(System.out::println);
                case 2 ->{System.out.print("Filmdin atyn jazynyz: "); movie.findMovieByName(new Scanner(System.in).nextLine(), movies);}
                case 3 ->{System.out.print("Acterdun atyn jazynyz: ");movie.findMovieByActorName(new Scanner(System.in).nextLine(), movies);}
                case 4 ->{System.out.print("Filmdin jylyn jazynyz: "); movie.findMovieByYear(new Scanner(System.in).nextInt(), movies);}
                case 5 ->{System.out.print("Direktordun atyn jazynyz: ");movie.findMovieByDirector(new Scanner(System.in).nextLine(),movies);}
                case 6 ->{System.out.print("Filmdin maanisin jazynyz: "); movie.findMovieByDescription(new Scanner(System.in).nextLine(), movies);}
                case 7 ->{System.out.print("Filmdegi rolun jazynyz: ");movie.findMovieByRole(new Scanner(System.in).nextLine(),movies);}
                case 8 ->{System.err.println("\n========Filmderdi aty boyuncha sorttop berdi========");movies.sort(Movie.sortByName); System.out.println(movies);}
                case 9 ->{System.err.println("\n========Filmderdi jyly boyuncha sorttop berdi======"); movies.sort(Movie.sortByYear); System.out.println(movies);}
                case 10 ->{System.err.println("\n========Filmderdi direktor boyuncha sorttop berdi======");movies.sort(Movie.sortByDirector);System.out.println(movies);}
                default -> System.err.println("Tileke karshy myndai funksia jok!");
            }
        }
    }
}
