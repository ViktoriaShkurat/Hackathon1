package com.example.chat

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {


    /*
    * @GetMapping annotation maps HTTP GET requests onto specific handler methods.
    * It is a composed annotation that acts as a shortcut for
    * @RequestMapping(method = RequestMethod.GET).
    * */

    @GetMapping("/")
    fun chat(model: Model) :String{
        model["title"] = "Blog"
        return "chat"
    }
}