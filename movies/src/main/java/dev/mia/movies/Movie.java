package dev.mia.movies;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "movies")

@Data
@AllArgsConstructor //constructor with all arguments
@NoArgsConstructor
public class Movie {
    private ObjectId id;

    @Id //lets database know this is the primary identifier/key for each movie
    private String imdbId;

    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference //store only id's of reviews, store in a separate collection
    private List<Review> reviewIds;
}
