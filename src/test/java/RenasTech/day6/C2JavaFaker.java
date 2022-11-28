package RenasTech.day6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class C2JavaFaker {

    @Test
     public void Testcase1_javaFaker() {
        //in order to use javafaker library utilities we have to create an object

        Faker faker = new Faker();
        System.out.println("faker.name().fullName(): "+faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.lordOfTheRings().character());
        System.out.println(faker.artist().name());

    }

}
