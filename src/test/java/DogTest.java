import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void setName() {
        Dog dog = new Dog("Reks", 5);
        String expected = "Keks";
        dog.setName("Keks");
        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void setAge() {
        Dog dog = new Dog("Reks", 5);
        int expected = 3;
        dog.setAge(3);
        Assert.assertEquals(expected, dog.getAge());
    }

    @Test
    public void getName() {
        Dog dog = new Dog("Reks", 5);
        String expected = "Reks";
        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void getAge() {
        Dog dog = new Dog("Reks", 5);
        int expected = 5;
        Assert.assertEquals(expected, dog.getAge());
    }
}
