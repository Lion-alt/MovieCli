package ch.bbw.m226.moviecli;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test 
    void titleMustNotBeNull() {        
        assertThrows(IllegalArgumentException.class, () -> new Movie(null, 2020, Genre.COMEDY));}
    @Test 
    void yearMustBeValid() { 
        assertThrows(IllegalArgumentException.class, () -> new Movie("Hello", 2030, Genre.CRIME));
    }
    @Test
    void yearMustNotBeToOld() {
    assertThrows(IllegalArgumentException.class, () -> new Movie("Hello", 2050, Genre.CRIME));
    }
    @Test 
    void yearMustNotBeZero(){
        assertThrows(IllegalArgumentException.class, () -> new Movie("Hello", 0, Genre.CRIME));
    }


}
