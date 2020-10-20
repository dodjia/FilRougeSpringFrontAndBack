package com.filRouge.filRouge.Job;
import lombok.Data;

@Data
public class SquareJob {
  private int length;
  private int x;
  private int y;
  private String color;
  Integer composition;

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Integer getComposition() {
    return 1;
  }

  public void setComposition(Integer composition) {
    this.composition = composition;
  }
}
