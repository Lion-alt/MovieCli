package ch.bbw.m226.moviecli;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Component;

@Component 
public class MovieStore {        
    ObjectMapper objectMapper = new ObjectMapper();
    MovieCollection writeMovies = new MovieCollection(List.of(new Movie("Fast and Furious 8", 456, Genre.CRIME), new Movie("Hello", 2020, Genre.CRIME)));

    public ObjectMapper getObjectMapper() 
    { return objectMapper; }
    
    public void persist(MovieCollection movieCollection) throws IOException{                
        System.out.println("implement persist...");   
        objectMapper.writeValue(new File("target/classes/ch/bbw/m226/moviecli/movie.json"), movieCollection);    
     }        
        public MovieCollection read() throws  IOException {                
            System.out.println("implement read...");
            MovieCollection movies = objectMapper.readValue(new File("target/classes/ch/bbw/m226/moviecli/movie.json"), MovieCollection.class);
            return movies;
        }

        }
