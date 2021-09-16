package com.example.demo.Controller;

import com.example.demo.Models.Post;
import com.example.demo.Repos.Repo;
import com.example.demo.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Optional;

@RestController
public class RESTController {
    @Autowired
    private Repo postRepo;
    @CrossOrigin()
    @RequestMapping(value = "/saveDocument", method = RequestMethod.POST)
    @ResponseBody

    public HashMap saveData(@RequestBody String a){
        HashMap<String, Integer> map = new HashMap();
        Post post = new Post();

        post.setData(a);
        postRepo.save(post);
        map.put("id", post.getId());
        return map;
    }

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity userData(@RequestBody User user){
        String res = userService.setUser(user);
        return ResponseEntity.ok(res);
    }



















    @CrossOrigin()
    @RequestMapping(value = "/getDocument/{id}", method = RequestMethod.GET)
    @ResponseBody
    public HashMap getData(@PathVariable("id") Integer id){
        HashMap<String, String> map = new HashMap();
        Optional<Post> post = postRepo.findById(id);

        if (post.isPresent()){
            map.put("data", post.get().getData());
        }else{
            map.put("data", "was not found");
        }

        return map;
    }
}
