package com.drawingMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("duc",21,10));
        studentList.add(new Student("anh",21,9));
        studentList.add(new Student("hoa",21,8));
        studentList.add(new Student("long",21,11));
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while(choice != 0) {
            int checkEx = -2;
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả học sinh ");
            System.out.println("2. Hiển thị học sinh có điểm cao nhất");
            System.out.println("3. Thêm mới 1 học sinh ");
            System.out.println("4. Sửa học sinh theo tên: ");
            System.out.println("5. Tính điểm trung bình của lớp: ");
            System.out.println("0. Exit");
            System.out.println("Chọn menu: ");
            while (checkEx == -2){
                try {
                    choice =  input.nextInt();
                    checkEx = 1;
                } catch (Exception e){
                    System.out.println("Vui lòng nhập số");
                    input.nextLine();

                }
            }
            switch (choice) {
                case 1:
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println(studentList.get(i));
                    }
                    break;
                case 2:
                    int max = 0;
                    Student studentMax = new Student();
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).getPoint() > max){
                            max = studentList.get(i).getPoint();
                            studentMax = studentList.get(i);
                        }
                    }
                    System.out.println(studentMax);
                    break;
                case 3:
                    String name;
                    int age;
                    int point;
                    System.out.println("Nhập tuổi học sinh:  ");
                    age = input.nextInt();
                    input.nextLine();
                    System.out.println("Nhập tên học sinh:  ");
                    name = input.nextLine();
                    System.out.println("Nhập điểm học sinh:  ");
                    point = input.nextInt();
                    Student newStudent = new Student(name,age,point);
                    studentList.add(newStudent);
                    System.out.println(" Thêm thành công !");
                    break;
                case 4:
                    String nameFix;
                    input.nextLine();
                    int index = -2;
                    System.out.println("Nhập tên học sinh: ");
                    nameFix = input.nextLine();
                    for (int i = 0; i < studentList.size(); i++) {
                        if(nameFix.equals(studentList.get(i).getName())){
                            System.out.println("Tìm thấy học sinh: ");
                            index = i;
                            System.out.println(studentList.get(i));
                            System.out.println("Sửa điểm học sinh");
                            int pointFix = input.nextInt();
                            studentList.get(index).setPoint(pointFix);
                            System.out.println(studentList.get(index));
                            index =1;
                            break;
                        }
                    }
                    if(index != 1){
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 5:
                    double avg = 0;
                    for (int i = 0; i < studentList.size(); i++) {
                        avg += studentList.get(i).getPoint();
                    }
                    avg /= studentList.size();
                    System.out.println("Điểm trung bình là: " + avg);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
