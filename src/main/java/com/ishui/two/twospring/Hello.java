package com.ishui.two.twospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: [李晓晖]
 */
@RestController
public class Hello {

    @Autowired
    Person person;

    @Value("${height}")
    String h;

    @Autowired
    ManRepository repository;

    @GetMapping(value = "/say/{name}")
    public String say(@PathVariable("name") String name){
        return h + " 您好，" + name;
    }

    @GetMapping("/person")
    public String person(){
        return person.toString();
    }

    @GetMapping("/save")
    public String save(){
        Man m=new Man();
        m.name = "张三";
        m.age = 32;
        repository.save(m);
        return "成功";
    }

}
