package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Greeting controller.
 */
@Controller
public class GreetingController {

    /**
     * Greeting method.
     * @param name name to greet
     * @param model model to bind the attribute
     * @return string
     */
    @GetMapping("/greeting")
    public final String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") final String name,
            final Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
