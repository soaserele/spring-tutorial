package teach.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import teach.blog.service.NewsService;

import java.util.Date;

@Controller
public class FrontController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/index")
    public String hello(ModelMap model) {
        model.addAttribute("news", newsService.getAllNews());
        return "front";
    }

}
