public class SortName extends Movie implements Comparable <Movie>{

    @Override
    public int compareTo(Movie o) {
        return getName().compareTo(o.getName());
    }
}
