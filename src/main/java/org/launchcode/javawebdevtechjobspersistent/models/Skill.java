package org.launchcode.javawebdevtechjobspersistent.models;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    @NotNull
    @Size(min = 1, max = 1000)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill() {
    }

}