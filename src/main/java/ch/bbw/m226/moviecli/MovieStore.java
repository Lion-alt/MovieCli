package ch.bbw.m226.moviecli;

import org.springframework.stereotype.Component;

@Component 
public class MovieStore {        
    ObjectMapper objectMapper = new ObjectMapper();
    Movie movie = new Movie("Fast and Furious 8", 2016, Genre.ACTION);
    objectMapper.writeValue(new File("target/movie.json"), objectMapper.writeValueAsString(movie));
    public void persist(MovieCollection movies) {                
        System.out.println("implement persist...");        }        
        public MovieCollection read() {                
            System.out.println("implement read..."); 
                   }

        }
