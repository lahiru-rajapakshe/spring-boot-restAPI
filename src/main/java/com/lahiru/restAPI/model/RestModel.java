package com.lahiru.restAPI.model;

import javax.persistence.*;

@Entity
@Table(name = "contact_details")

public class RestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   @Column(name = "Age")
    private Integer age;
    @Column(name = "First_name")
    private String fname;


    @Column(name = "Last_name")
    private String lname;

    public RestModel() {
    }

    public RestModel(Integer id, Integer age, String fname, String lname) {
        this.id = id;
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "RestModel{" +
                "id=" + id +
                ", age=" + age +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

}
