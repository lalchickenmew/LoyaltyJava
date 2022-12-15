package com.example.training.demo.API;

import com.example.training.demo.Models.REGISTER;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/test")
public class TestAPI {
    @GetMapping
    @RequestMapping("/testget/{name}/{lname}")
    public REGISTER test(@PathVariable String name ,@PathVariable String lname){
        REGISTER register = new REGISTER();
        register.setName(name);
        register.setLname(lname);
        return  register;
    }
    @GetMapping
    @RequestMapping(value = "/ex/bars/{numericId:[\\d]+}", method = GET)
    @ResponseBody
    public String getBarsBySimplePathWithPathVariable(
            @PathVariable long numericId) {
        return "Get a specific Bar with id=" + numericId;
    }//http://localhost:8080/test/ex/bars/1

    @PostMapping
    @RequestMapping("/testpost")
    public String postapitest(@RequestBody REGISTER data){
        return "hello "+data.getName();
    }
}
