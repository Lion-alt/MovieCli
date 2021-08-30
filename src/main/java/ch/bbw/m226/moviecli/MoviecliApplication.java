package ch.bbw.m226.moviecli;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviecliApplication implements CommandLineRunner {
	private final MovieStore movieStore;

    private static Logger LOG = LoggerFactory
      .getLogger(MoviecliApplication.class);


      public MoviecliApplication(MovieStore movieStore) 
      {        this.movieStore = movieStore;
      }
    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(MoviecliApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("EXECUTING : command line runner");
 
        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
        if(args[0].equals("add")) {
            System.out.println("added Movie " + args[0] + "|\n" +  args[1] + args[2]);
            movieStore.persist(new MovieCollection(List.of(new Movie(args[1], Integer.parseInt(args[2]), Genre.valueOf(args[3])))));
        }
        if(args[1].equals("read")) {
            MovieCollection movieCollection = movieStore.read();
            for(int i = 0; i<= movieCollection.movies().size(); i++ ) 
            {        
                System.out.println(movieCollection.movies().get(i)  + "|\n");
            }
        }
        /* if(args[1].equals("delete")) {
            movieStore.delete();
        }*/
		
      
    }

}


