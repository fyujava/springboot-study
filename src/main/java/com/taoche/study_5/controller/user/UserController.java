package com.taoche.study_5.controller.user;

import com.taoche.study_5.vo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/list")
    public String list(Model model){
        List<Users> userList = new ArrayList<Users>();

        for (int i = 0; i < 9; i++) {
            Users vo = new Users();

            vo.setId(i);
            vo.setName("pepstack-" + i);
            vo.setMobile("1860108950" + i);
            vo.setAge(20 + i);

            userList.add(vo);
        }
        model.addAttribute("userList",userList);
        return "user/list";

    }
}
