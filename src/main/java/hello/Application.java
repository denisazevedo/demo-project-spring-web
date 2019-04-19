package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application's main class.
 */
@SpringBootApplication
public class Application {

    /**
     * Main method.
     * @param args
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
