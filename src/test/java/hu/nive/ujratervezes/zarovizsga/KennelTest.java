package hu.nive.ujratervezes.zarovizsga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KennelTest {

    Kennel kennel = new Kennel();

    @BeforeEach
    void init() {
        Beagle beagle = new Beagle("Bigli");
        kennel.addDog(beagle);
        Husky husky = new Husky("Morzsi");
        kennel.addDog(husky);
        Husky husky2 = new Husky("Zokni");
        kennel.addDog(husky2);
    }

    @Test
    void testAddDog() {
        List<Dog> dogs = kennel.getDogs();
        assertEquals(3, dogs.size());
        assertEquals("Morzsi", dogs.get(1).getName());
    }

}