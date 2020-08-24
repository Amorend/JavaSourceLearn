package com.company.test.design_patterns.com.wdzl.protype.demo2;

public class School //implements Cloneable
{
    private String scname;

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    @Override
    public String toString() {
        return "School{" +
                "scname='" + scname + '\'' +
                '}';
    }

//    @Override
    public Object clone() throws CloneNotSupportedException {
        School school = new School();
        school.setScname(this.scname);
        return school;
    }
}
