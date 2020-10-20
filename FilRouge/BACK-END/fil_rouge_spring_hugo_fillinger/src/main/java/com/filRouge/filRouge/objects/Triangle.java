
package com.filRouge.filRouge.objects;

import javax.persistence.Entity;


public class Triangle extends ObjectGeo {

  public Triangle() {
    setSide(3);
    setColor("black");
    setTypeOfObject("triangle");


  }

  @Override
  public double getArea() {
    return (Math.sqrt(3)/4)*Math.pow(getLength(), 2);
  }
  @Override
  public double getPerimeter() {
    return getLength() * 3;
  }
}

