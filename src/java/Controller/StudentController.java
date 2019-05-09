/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author p104--01
 */
@ManagedBean(name="student")
@RequestScoped
public class StudentController {
    private List<Student> studentList;
    
    private String searchText;
    
    public List<Student> getStudent(){
        
        studentList = new ArrayList<>();
        
        studentList.add(new Student ("1","Congdoan","1993", "HaNam", "096743228"));
        studentList.add(new Student ("2","MinhDuc","1998", "HaNoi", "093432665"));
        studentList.add(new Student ("3","DucMinh","1995", "HaiPhong", "0172363"));
        studentList.add(new Student ("4","PhuongDuy","1995", "BacNinh", "0123785"));
        
        return studentList;
    }

    public List<Student> getStudentList() {
        
        return studentList;
    }

    public void setStudentList(String rollNumber, String name, String birthday, String address, String phone) {
        
        this.studentList = studentList;
    }

    public List<Student> getSearchText() {
        
        List<Student> search = new ArrayList<>();
        
        if (searchText == null || searchText == "") {
            System.out.println("Vui long nhap ma so Sv hoac nam sinh!");
        }
        System.out.println(searchText);
        for (Student students : studentList) {
            if (students.getName().contains(searchText)|| students.getBirthday().contains(searchText)) {
                search.add(students);
            }
        }
        System.out.println(search.size());
        
        return search;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    
}
