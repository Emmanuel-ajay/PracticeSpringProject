package com.example.SpringProject.Controller;

import com.example.SpringProject.Dto.HomeDto;
import com.example.SpringProject.Entity.Home;
import com.example.SpringProject.Service.HomeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/home")
public class HomeController {
    private final HomeService homeservice;

    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    public HomeController(HomeService homeservice)  {
        this.homeservice  = homeservice;
    }

    @GetMapping
    public List<Home> getHome(){
        return homeservice.getHome();
    }

    @PostMapping
    public Home saveHome(@Valid @RequestBody HomeDto homeRequest){
        // map home request of type homeDto to HOme entity
        System.out.println(homeRequest);
        Home  homeObject = modelMapper.map(homeRequest,Home.class);
        return  homeservice.saveHome(homeObject);
    }
}

