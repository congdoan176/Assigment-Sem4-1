/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author p104--01
 */
public class Student {
    public String rollNumber;
    public String name;
    public String birthday;
    public String address;
    public String phone;

    public Student(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumber() {
        return rollNumber;
    }

    public void setNumber(String number) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student(String rollNumber, String name, String birthday, String address, String phone) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name=" + name + ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + '}';
    }
    
    
}
