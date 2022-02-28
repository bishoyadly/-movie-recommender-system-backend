package recommendersystem.movierecommender.moviecomponent.usecases;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import recommendersystem.movierecommender.moviecomponent.entities.Movie;
import recommendersystem.movierecommender.moviecomponent.entities.MoviesPage;

@Mapper
public interface MovieMapper {
    MovieOutputData movieToMovieOutputData(Movie movie);

    @Mapping(target = "movieOutputDataList", source = "movieList")
    MoviesPageOutputData moviesPageToMoviesPageOutputData(MoviesPage movie);
}
