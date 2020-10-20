package com.filRouge.filRouge.Job;

import com.filRouge.filRouge.objects.ObjectGeo;

import java.util.ArrayList;
import java.util.List;

public class CompositionJob {
  String name;
  List<ObjectGeo> objets = new ArrayList<>();


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ObjectGeo> getObjets() {
    return objets;
  }

  public void setObjets(List<ObjectGeo> objets) {
    this.objets = objets;
  }
}
