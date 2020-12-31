/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author localadm
 */
public class Validate implements Vali {

    @Override
    public void add(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm");
        double mark = Double.parseDouble(sc.nextLine());

        Student s = new Student(name, age, mark);
        list.add(s);

    }

    @Override
    public void display(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Override
    public void remove(List<Student> list, int index) {
        list.remove(index);
    }

    @Override
    public void edit(List<Student> list, int index) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm");
        double mark = Double.parseDouble(sc.nextLine());
        
        list.get(index).setName(name);
        list.get(index).setAge(age);
        list.get(index).setMark(mark);

    }

}
