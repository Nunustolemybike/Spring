package com.example.SpringProject;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieRepositoryTest {
    @Autowired
    private MovieRepository filmRepository;
    @Before
    public void setUp() throws Exception {
        Movie film1= new Movie("AliceaupaysdesMerveilles", null, null, null, 0, 0, null, 0, 0, 0, null, null, null, null, null);
        Movie film2= new Movie("Boblebricoleur", null, null, null, 0, 0, null, 0, 0, 0, null, null, null, null, null);
        //save user, verify has ID value after save
        //assertNull(film1.getFilmId());
        //assertNull(film2.getFilmId());//null before save
        this.filmRepository.save(film1);
        this.filmRepository.save(film2);
        assertNotNull(film1.getFilmId());
        assertNotNull(film2.getFilmId());
    }

    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Movie film1 = filmRepository.findByfilmtitre("Boblebricoleur");
        assertNotNull(film1);
        assertEquals("Boblebricoleur", film1.getFilmTitle());
        /*Get all products, list should only have two*/
        Iterable<Movie> films = filmRepository.findAll();
        int count = 0;
        for(Movie p : films){
            count++;
        }
  //      assertEquals(count, 9741);
   }
}
