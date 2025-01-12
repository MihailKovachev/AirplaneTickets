package bg.smg.airplanetickets.controller;

import bg.smg.airplanetickets.model.User;
import bg.smg.airplanetickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @PostMapping("/users/add")
    public String addUser(@ModelAttribute("user") User user) {
        // save employee to database
        userService.addUser(user);
        return "redirect:/";
    }

}
