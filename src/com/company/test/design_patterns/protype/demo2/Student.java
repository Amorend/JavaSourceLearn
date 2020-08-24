package com.company.test.design_patterns.protype.demo2;

public class Student implements Cloneable {
    //序列化transient
    private transient String name;
    private School school;
    private String address;
    private String zhuanye;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        Student student = (Student) super.clone();
//        School school = (School) student.getSchool().clone();
//        student.setSchool(school);
//        return student;
        Student student = new Student();
        student.setZhuanye(this.zhuanye);
        student.setSchool(this.school);
        student.setAddress(this.address);
        student.setSchool((School) this.getSchool().clone());
        return student;
    }
}
