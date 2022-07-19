package com.task.proj.Taskapp.controllers;


import com.task.proj.Taskapp.model.Tasks;
import com.task.proj.Taskapp.service.Taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks/")
public class Taskcontroller {
    @Autowired
    private Taskservice taskservice;

    @GetMapping("/alltask")
    public List<Tasks> getalltask(){
        return taskservice.getalltask();
    }
    @PostMapping("/addtask")
    public Tasks addtask(@RequestBody Tasks task){
        return taskservice.addtask(task);
    }

    @GetMapping("/findbyid/{id}")
    public Optional<Tasks> findtask(@PathVariable int id){
        return taskservice.findtask(id);
    }

    @PutMapping("/updatetask")
    public String updatetask(@RequestBody Tasks task){

        Optional<Tasks> endtask= taskservice.updatetask(task);
        System.out.println(endtask);
        if(endtask==null){
            return "Task not found";
        }
        else {
            return "updated";
        }
    }
    @DeleteMapping("/deletetask/{id}")
    public String deletetask(@PathVariable int id){
        return taskservice.deletetask(id);
    }
}
