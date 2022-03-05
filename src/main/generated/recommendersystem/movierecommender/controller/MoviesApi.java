/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package recommendersystem.movierecommender.controller;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import recommendersystem.movierecommender.model.MovieDto;
import recommendersystem.movierecommender.model.MoviesPageDto;
import recommendersystem.movierecommender.model.ProblemDto;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.Optional;
import java.util.UUID;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "movies", description = "the movies API")
public interface MoviesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /movies/most-popular-movies : Get Most Popular Movies
     *
     * @param pageSize   (optional, default to 10)
     * @param pageNumber (optional, default to 1)
     * @return success response (status code 200)
     */
    @ApiOperation(value = "Get Most Popular Movies", nickname = "getMostPopularMovies", notes = "", response = MoviesPageDto.class, tags = {"Movie",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success response", response = MoviesPageDto.class)})
    @GetMapping(
            value = "/movies/most-popular-movies",
            produces = {"application/json"}
    )
    default ResponseEntity<MoviesPageDto> getMostPopularMovies(@Min(5) @ApiParam(value = "", defaultValue = "10") @Valid @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize, @Min(1) @ApiParam(value = "", defaultValue = "1") @Valid @RequestParam(value = "pageNumber", required = false, defaultValue = "1") Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"elementsNumber\" : 1, \"pageNumber\" : 6, \"totalPages\" : 5, \"pageSize\" : 0, \"content\" : [ { \"overview\" : \"movie overview\", \"releaseDate\" : \"10-10-2010\", \"imdbId\" : \"tt0435761\", \"imageUrl\" : \"https://m.media-amazon.com/images/M/MV5BMTgxOTY4Mjc0MF5BMl5BanBnXkFtZTcwNTA4MDQyMw@@._V1_QL75_UY281_CR5,0,190,281_.jpg\", \"genresList\" : [ \"ACTION\", \"COMEDY\" ], \"rating\" : 8.7, \"ratingsCount\" : 100, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"title\" : \"Toy Story 3\", \"originalLanguage\" : \"english\", \"productionCompanies\" : [ \"Marvel\", \"Disney\" ], \"productionCountries\" : [ \"USA\", \"France\" ] }, { \"overview\" : \"movie overview\", \"releaseDate\" : \"10-10-2010\", \"imdbId\" : \"tt0435761\", \"imageUrl\" : \"https://m.media-amazon.com/images/M/MV5BMTgxOTY4Mjc0MF5BMl5BanBnXkFtZTcwNTA4MDQyMw@@._V1_QL75_UY281_CR5,0,190,281_.jpg\", \"genresList\" : [ \"ACTION\", \"COMEDY\" ], \"rating\" : 8.7, \"ratingsCount\" : 100, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"title\" : \"Toy Story 3\", \"originalLanguage\" : \"english\", \"productionCompanies\" : [ \"Marvel\", \"Disney\" ], \"productionCountries\" : [ \"USA\", \"France\" ] } ], \"totalElements\" : 5.962134 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /movies/{movieId} : Get Movie By Id
     *
     * @param movieId (required)
     * @return success response (status code 200)
     * or movie not found response (status code 404)
     */
    @ApiOperation(value = "Get Movie By Id", nickname = "getMovieById", notes = "", response = MovieDto.class, tags = {"Movie",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success response", response = MovieDto.class),
            @ApiResponse(code = 404, message = "movie not found response", response = ProblemDto.class)})
    @GetMapping(
            value = "/movies/{movieId}",
            produces = {"application/json"}
    )
    default ResponseEntity<Object> getMovieById(@ApiParam(value = "", required = true) @PathVariable("movieId") UUID movieId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"overview\" : \"movie overview\", \"releaseDate\" : \"10-10-2010\", \"imdbId\" : \"tt0435761\", \"imageUrl\" : \"https://m.media-amazon.com/images/M/MV5BMTgxOTY4Mjc0MF5BMl5BanBnXkFtZTcwNTA4MDQyMw@@._V1_QL75_UY281_CR5,0,190,281_.jpg\", \"genresList\" : [ \"ACTION\", \"COMEDY\" ], \"rating\" : 8.7, \"ratingsCount\" : 100, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"title\" : \"Toy Story 3\", \"originalLanguage\" : \"english\", \"productionCompanies\" : [ \"Marvel\", \"Disney\" ], \"productionCountries\" : [ \"USA\", \"France\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
