package com.example.SpringProject.Service;

import com.example.SpringProject.Entity.Home;
import com.example.SpringProject.Repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
    private HomeRepository homeRepository;
//    public HomeService(HomeRepository homeRepository)
//    {
//        this.homeRepository  = homeRepository;
//    }


    public List<Home> getHome(){
        return homeRepository.findAll();
    }

    public Home saveHome(Home home){
        return homeRepository.save(home);
    }
}
