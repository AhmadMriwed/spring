package com.example.demo2.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class ReportFile extends BaseEntity{
    private String stateFile;

    @ManyToOne(targetEntity = File.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "file_id",referencedColumnName = "id")
    private File file;
    @ManyToOne(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

//    @ManyToMany(mappedBy = "groupsSet")
  //  private Set<User> userSet =new HashSet<>();
}
