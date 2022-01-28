package tech.gatarrays.employeemanager.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

//Serializable convert the class into streams
//to be able to save it in database
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //updatable means the id will be generated one time
    //and cannot be updated
    @Column(nullable=false, updatable=false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imgUrl;

    public Employee(){}

    public Employee(Long id, String name, String email, String jobTitle, String phone, String imgUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", ImgUrl='" + imgUrl + '\'' +
                "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
