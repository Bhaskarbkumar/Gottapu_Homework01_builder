package Builder;
import Builder.export.Movie;
public class MovieBuilder implements PresentationBuilder{
    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(),  5);
    }
    public Movie getMovie(){
        return this.movie;
    }
}
