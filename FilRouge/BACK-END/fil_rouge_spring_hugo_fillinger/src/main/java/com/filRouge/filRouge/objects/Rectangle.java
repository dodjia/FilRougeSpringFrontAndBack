
package com.filRouge.filRouge.objects;

import javax.persistence.Entity;


public class Rectangle extends ObjectGeo {
  public Rectangle() {

    setTypeOfObject("rectangle");
    setSide(4);
    setColor("black");
    setX(900);
    setY(500);

  }

  @Override
  public double getArea() {
    return getWidth() * getLength();
  }
  @Override
  public double getPerimeter() {
    return (getLength() * getWidth()) * 2;
  }

}
