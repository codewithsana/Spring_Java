package com.spring.demo.eg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/hello")
public String Hello() {
return "sana";	
}
}
