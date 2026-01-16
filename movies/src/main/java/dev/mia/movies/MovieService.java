package dev.mia.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    @Autowired //ask framework to instantiate the class for us
    private MovieRepository movieRepository;
    
    //database access methods
    public List<Movie> getAllMovies() {
        return movieRepository.findAll(); //find all is defined in MongoRepository class
    }
}
