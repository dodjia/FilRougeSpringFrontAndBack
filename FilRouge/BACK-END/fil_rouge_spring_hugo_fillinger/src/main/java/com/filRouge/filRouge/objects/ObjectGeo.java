package com.filRouge.filRouge.objects;

import javax.persistence.*;

@Entity
public abstract class ObjectGeo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String name;
  private String typeOfObject;
  private int side;
  private int length;
  private int width;
  private String color;
  private int x;
  private int y;
  private double area;
  private double perimeter;

  @ManyToOne
  public Composition composition;

  public ObjectGeo() {
  }

  public void introduce() {
    System.out.println("La forme est un " + typeOfObject + " qui possède " + side + " côtés et vous avez appellez votre " + typeOfObject + " ' " + name + " '");
    System.out.println("");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTypeOfObject() {
    return typeOfObject;
  }

  public void setTypeOfObject(String typeOfObject) {
    this.typeOfObject = typeOfObject;
  }

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
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

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public Composition getComposition() { return composition; }

  public void setComposition(Composition composition) { this.composition = composition; }
}
