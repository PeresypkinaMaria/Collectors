import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DogCollectorTest {
    @Test
    public void getOldDog(){
        Stream<Dog> stream = Stream.of(new Dog("Snoopy", 7), new Dog("Chips", 10),
                new Dog("Chubaka", 4), new Dog("Voody", 1), new Dog("Drug", 13),
                new Dog("Sharik", 8));
        ArrayList<String> oldDog = stream.collect(DogCollector.getOldDog());
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Chips");
        expected.add("Drug");
        expected.add("Sharik");
        Assert.assertEquals(expected, oldDog);
    }
}