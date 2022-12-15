package com.example.training.demo.API;

import com.example.training.demo.BusinessLogic.BusinessLogic;
import com.example.training.demo.Models.REGISTER;
import com.example.training.demo.Models.USERDATA;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginAPI {
    @GetMapping
    @RequestMapping("/getlogin/{username}/{password}")
    public String CheckLogIn(@PathVariable String username , @PathVariable String password){
        try{
            BusinessLogic service = new BusinessLogic();
            return service.getUser(username , password);
        }
        catch (Exception ex){
            return  ex.getMessage();
        }
    }

    @PostMapping
    @RequestMapping("/registerpage")
    public USERDATA Register(@RequestBody USERDATA dataUser){
        try{
            USERDATA putinUserData = new USERDATA();
            putinUserData = dataUser;

        }catch (Exception ex){

        }
        return dataUser;
    }

}
