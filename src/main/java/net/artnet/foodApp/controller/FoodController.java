package net.artnet.foodApp.controller;

@Controller
public class FoodController {

    @GetMapping('/')
    public String home(){
        return "home";
    }
}
