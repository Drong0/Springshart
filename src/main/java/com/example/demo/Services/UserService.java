package com.example.demo.Services;

import com.example.demo.User;
import jdk.jfr.DataAmount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, String > users=new HashMap<>();
    public String setUser(User user){
        if(users.containsKey(user.getId())){
            return "zhopu nuhay";
        }
        return "OK";
    }

    public List<User> getUsers(){
        return users;
    }
}
