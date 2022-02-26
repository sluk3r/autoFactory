package sluk3r.autofactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.bark(); // woof
        Animal cat = AnimalFactory.createAnimal("cat");
        cat.bark(); // meow
        
    }
}
