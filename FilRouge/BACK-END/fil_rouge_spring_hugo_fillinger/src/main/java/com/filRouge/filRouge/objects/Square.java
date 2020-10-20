
package com.filRouge.filRouge.objects;

import com.filRouge.filRouge.Job.SquareJob;

import javax.persistence.Entity;

@Entity
public class Square extends ObjectGeo {
  public Square(SquareJob job, Composition composition) {
    this.composition = composition;
    setTypeOfObject("carré");
    setSide(4);

/*    setX(job.getX());
    setLength(job.getLength());
    setY(job.getY());
    setColor(job.getColor());*/

  }
  public Square(SquareJob job, Integer compo) {
    setTypeOfObject("carré");
    setSide(4);
    setX(job.getX());
    setY(job.getY());
    setColor(job.getColor());

  }

  public Square() { setSide(4); }


  @Override
  public double getArea() {
    return getLength() * getLength();
  }
  @Override
  public double getPerimeter() {
    return 4 * getLength();
  }
}

