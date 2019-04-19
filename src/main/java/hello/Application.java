package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * Application's main class.
 */
@SpringBootApplication
public class Application {

    /**
     * Main method.
     * @param args Application arguments
     */
    public static void main(final String[] args) {
        //SpringApplication.run(Application.class, args);
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
    }

}
