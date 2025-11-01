package num.student.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/Explore Programs")
    public String showHomePage() {
        return "home"; // This refers to home.html in src/main/resources/templates
    }
}