package americanSuperhero;

public class SpiderMan {

    String movieName;
    String directedBy;

    public SpiderMan()
    {
        movieName = "Unknown";
        directedBy = "Unknown";
    }

    public SpiderMan(String movieName, String directedBy){
        this.movieName = movieName;
        this.directedBy = directedBy;
    }

    public void show()
    {
        System.out.println("Movie name :" + movieName);
        System.out.println("Director's name :" + directedBy);
    }
}
