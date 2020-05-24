package com.Users.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Users;

@Controller
@RequestMapping({ "/", "/users" })
public class UsersController {
    private static final Object user = null;

	@GetMapping()
    public String getAllUsers(Model model) {
        List<Users> users = new ArrayList<Users>();
        // Code to query the database and
        // add actors to the List will go here
        model.addAttribute("user", user);
        return "user";
    }
}