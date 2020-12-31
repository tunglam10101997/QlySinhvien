/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.util.List;

/**
 *
 * @author localadm
 */
public interface Vali {
    public void add(List<Student> list);
    public void display(List<Student> list);
    public void remove(List<Student> list,int index);
    public void edit (List<Student> list,int index);
}
