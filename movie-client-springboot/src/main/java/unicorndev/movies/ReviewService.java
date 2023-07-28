package unicorndev.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MovieRepository movieRepository;

    public List<Review> getAllReviews() {
        return repository.findAll();
    }

    public Review createReview(String reviewBody, String imdbId) {
        Review review = repository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

        Optional<Movie> optionalMovie = movieRepository.findMovieByImdbId(imdbId);
        if (optionalMovie.isPresent()) {
            Movie movie = optionalMovie.get();
            movie.getReviews().add(review);
            movieRepository.save(movie);
        }

        return review;
    }
}


