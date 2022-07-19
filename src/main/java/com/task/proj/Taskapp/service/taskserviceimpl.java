package com.task.proj.Taskapp.service;

import com.task.proj.Taskapp.model.Tasks;
import com.task.proj.Taskapp.repository.taskrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class taskserviceimpl implements Taskservice {

    @Autowired
    private taskrepo taskrepository;


    @Override
    public List<Tasks> getalltask() {
        return taskrepository.findAll();
    }

    @Override
    public Tasks addtask(Tasks task) {
        return taskrepository.save(task);
    }

    @Override
    public Optional<Tasks> findtask(int id) {
        return taskrepository.findById(id);
    }

    @Override
    public Optional<Tasks> updatetask( Tasks task) {
            System.out.println(task);
            Tasks updatetask = taskrepository.findById(task.getId()).get();
        System.out.println(updatetask);
            updatetask.setTaskname(task.getTaskname());
            updatetask.setTaskcont(task.getTaskcont());
            taskrepository.save(updatetask);
            return Optional.of(updatetask);

    }

    @Override
    public String deletetask(int id) {

        Tasks finded= taskrepository.findById(id).get();
        if(finded==null){
            return "no data found";
        }
        taskrepository.delete(finded);
        return "deleted";
    }
}
