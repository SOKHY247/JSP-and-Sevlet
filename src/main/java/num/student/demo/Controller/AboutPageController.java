package num.student.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutPageController {

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // This maps to about.html in src/main/resources/templates
    }
}