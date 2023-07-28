package unicorndev.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    public ObjectId id;
    public String imdbId;
    public String title;
    public String releaseDate;
    public String trailerLink;
    public String poster;
    public List<String> genres;
    public List<String> backdrops;

    @DBRef
    public List<Review> reviews;
}
