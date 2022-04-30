package com.drawingMenu;

public class Student extends People{
    private int point;
    public Student (){
        super();
    }

    public Student(String name, int point) {
        super(name);
        this.point = point;
    }
    public Student(String name,int age, int point) {
        super(name,age);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "{" +
                "point = " + point +
                ", name = " + super.getName() +
                ", age = " + super.getAge() +
                '}';
    }

}
