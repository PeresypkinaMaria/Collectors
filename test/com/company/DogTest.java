package com.company;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class DogTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Dog.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

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
