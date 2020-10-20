package com.filRouge.filRouge.objects;

import com.filRouge.filRouge.Job.CompositionJob;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Composition {
  private String name;


  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Composition() {}

    public Composition(CompositionJob job) {
      this.name = (job.getName());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
