package com.task.proj.Taskapp.model;

import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.TableName;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "tasklist")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskid")
    int id;

    @Column(name = "task_name")
    String taskname;
    @Column(name = "task_cont")
    String taskcont;
}
