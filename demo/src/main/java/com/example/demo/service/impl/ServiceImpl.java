package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService {

    @Autowired
    UserRepository user;


    @Override
    public UserDto login(UserDto use) {
        Optional<User> data=user.findByName(
        use.getName());
        UserDto dto = new UserDto();
        System.out.println(data.get());

        if (data.get().getPassword().equals(use.getPassword()) && data.get().getName().equals(use.getName())) {
//dto.setId(use.getId());

dto.setName(use.getName());

            return dto;
        }
        return null;



    }

    @Override
    public User entitylogin(User use) {
        Optional<User> data=user.findByName(
                use.getName());
        User dto = new User();
        System.out.println(data.get());

        if (data.get().getPassword().equals(use.getPassword()) && data.get().getName().equals(use.getName())) {
//dto.setId(use.getId());

            dto.setName(use.getName());

            return dto;
        }
        return null;



    }



    @Override
    public List<User> createUser(List<User> use) {
//        try{
//        Optional<User> data=user.findByName(
//                use.getName());
//        }
//        catch (Exception e){
//            System.out.println("no user found");
//
//        }
//        List<User> ex = new ArrayList<>();
//
//        if (use.getPassword()!=null && use.getName()!=null) {
//        //dto.setId(use.getId());
//
//            //use.setName(use.getName());
//            Iterable<User> saveAll = saveAllUser(use);
//
//            //Iterables.size(saveAll);
//
//
//
//
//
//
//            return use;
   //     }
        return null;



    }

    private List<User> saveAllUser(List<User> use){
        for(User user : use) {
           // user.save(use);
        }
       // use.add(user);

        return  null;

    }
}
