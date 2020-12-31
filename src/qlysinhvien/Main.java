/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author localadm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vali v = (Vali) new Validate();
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(new Student("Bùi Tùng Lâm", 23, 8.0));
        list.add(new Student("Nguyễn Văn Trường", 23, 7.9));
        list.add(new Student("Phạm Văn Doan", 23, 7.8));
        list.add(new Student("Lê Thu Hằng", 22, 7.4));
        while (true) {
            int index = 0;
            int luaChon = 0;
            System.out.println("1 : Thêm sinh viên");
            System.out.println("2 : Sửa thông tin sinh viên ");
            System.out.println("3 : Xóa sinh viên");
            System.out.println("4 : Show thông tin sinh viên");
            System.out.println("0 : Thoát chương trình");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1: {
                    v.add(list);
                    break;
                }
                case 2: {
                    System.out.print("Nhập vị trí cần sửa :");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(list, index);
                    break;
                }
                case 3: {
                    System.out.print("Nhập vị trí cần xóa :");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list, index);
                    break;
                }
                case 4: {
                    v.display(list);
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
            }
        }

    }
}
