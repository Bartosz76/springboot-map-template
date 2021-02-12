package bm.app.springbootmaptemplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping
    public String getMap(Model model) {
        model.addAttribute("point", new Point(52.22, 21.01, "Żarcie!"));
        return "map";
    }
}
