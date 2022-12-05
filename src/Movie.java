import java.util.Comparator;
import java.util.List;

public class Movie implements Sortable, Findable {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie() {
    }

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(String name, List<Movie> movies) {
        for (Movie mov : movies) {
            if (mov.name.equals(name))
                System.out.println(mov);
            /*else System.err.println("Myndai film jok!");
            return;*/
        }
    }

    @Override
    public void findMovieByActorName(String act, List<Movie> movies) {
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getActorFullName().equals(act))
                    System.out.println(movie);
                /*else System.err.println("Myndai acter jok!");
                return;*/
            }
        }
    }

    @Override
    public void findMovieByYear(int num, List<Movie> movies) {
        for (Movie number : movies) {
            if (number.year == num)
                System.out.println(number);
            /*else System.err.println("Bul jyly chygarylgan film jok!");
            return;*/
        }
    }

    @Override
    public void findMovieByDirector(String dir, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.director.getName2().equals(dir))
                System.out.println(movie);
                /*else System.err.println("Myndai direktor jok!");
                return;*/
        }
    }

    @Override
    public void findMovieByDescription(String des, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movie.description.equals(des))
                System.out.println(movie);
            /*else System.err.println("Myndai opisaniyadagy film jok!");
            return;*/
        }
    }

    @Override
    public void findMovieByRole(String rol, List<Movie> movies) {
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getRole().equals(rol))
                    System.out.println(movie);
                /*else System.err.println("Myndai rol jok!");
                return;*/
            }
        }
    }


    @Override
    public void sortByMovieName(List<Movie> movies) {

    }

    @Override
    public void sortByYear(List<Movie> movies) {

    }

    @Override
    public void sortByDirector(List<Movie> movies) {

    }

    @Override
    public String toString() {
        return "\n===========================================================" +
                "\nMovie name: " + name +
                "\nyear: " + year +
                "\ndescription: " + description +
                "\ndirector: " + director +
                "\ncast: " + cast;

    }

    public static Comparator<Movie> sortByName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Movie> sortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName2().compareTo(o2.getDirector().getName2());
        }
    };
}
        /*@Override
        public int compare(Director o1, Director o2) {
            return o1.getName2().compareTo(o2.getName2());
        }

    };*/

