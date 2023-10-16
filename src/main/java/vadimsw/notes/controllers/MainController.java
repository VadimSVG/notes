package vadimsw.notes.controllers;

import org.springframework.stereotype.Controller;
import org. springframework.ui.Model;
import org.springframework.web. bind. annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }

}
