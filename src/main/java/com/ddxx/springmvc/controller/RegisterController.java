package com.ddxx.springmvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddxx.springmvc.bean.Spitter;

@Controller
@RequestMapping("/register")
public class RegisterController {
  
  @RequestMapping(value="/register", method=GET)
  public String showRegistrationForm(Model model) {
	model.addAttribute(new Spitter());
    return "registerForm2";
  }
  
  @RequestMapping(value="/register", method=POST)
  public String processRegistration(@Valid Spitter spitter,  Errors errors) {
    if (errors.hasErrors()) {
      return "registerForm2";
    }
    
    return "redirect:/spitter/" + spitter.getUsername();
  }
  
  @RequestMapping(value="/{username}", method=GET)
  public String showSpitterProfile(@PathVariable String username, Model model) {
    return "profile";
  }
  
}
