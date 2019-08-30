package com.tutorial.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tutorial.model.LoginModel;
import com.tutorial.service.LoginService;

import java.util.List;

@RestController
@RequestMapping("users")
public class LoginRestController<LoginEntity> {

	@Autowired
	LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET )
public void sayHello () {
    	@SuppressWarnings("unchecked")
		List<LoginEntity> users = (List<LoginEntity>) service.listUsers();
        for (LoginEntity user : users) {
           System.out.println("Id = "+((LoginModel) user).getId());
    
           System.out.println();
        }
}


}
