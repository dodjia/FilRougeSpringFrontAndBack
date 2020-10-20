
package com.filRouge.filRouge.objects;

import javax.persistence.Entity;

public class Circle extends ObjectGeo {

  public Circle() {

    setSide(0);
    setColor("black");
    setX(900);
    setX(500);
    setTypeOfObject("cercle");


  }


  @Override
  public double getArea() {
    return Math.PI * Math.pow(getLength(), 2);
  }
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * Math.pow(getLength(), 2);
  }

}

