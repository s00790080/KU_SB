package java.example.mujineki.G-00.03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Removed invalid token

@Controller
public class Idou {

    @GetMapping("/search")
    public String search() {
        // src/main/resources/templates/search.html を Thymeleaf でレンダリング
        return "search";
    }
}



