package recommendersystem.movierecommender.moviecomponent.adapters;

import org.springframework.stereotype.Component;
import recommendersystem.movierecommender.model.MoviesPageDto;
import recommendersystem.movierecommender.moviecomponent.usecases.MovieInputBoundary;

import java.util.UUID;

@Component
public class MovieComponent {

    private final MovieInputBoundary movieInputBoundary;

    public MovieComponent(MovieInputBoundary movieInputBoundary) {
        this.movieInputBoundary = movieInputBoundary;
    }

    public Object getMovieById(UUID movieId) {
        return movieInputBoundary.getMovieById(movieId);
    }

    public MoviesPageDto getMostPopularMoviesList(int pageSize, int pageNumber) {
        return (MoviesPageDto) movieInputBoundary.getMostPopularMoviesList(pageSize, pageNumber);
    }
}
