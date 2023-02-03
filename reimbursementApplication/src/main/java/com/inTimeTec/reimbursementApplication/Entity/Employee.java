package com.inTimeTec.reimbursementApplication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="tbl_employees", uniqueConstraints = @UniqueConstraint(columnNames = "e_email"))
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emp_seq")
    @SequenceGenerator(name="emp_seq",initialValue = 1001, allocationSize=1 )
    @Column(name = "e_id")
    private int id;

    @Column(name = "e_name")
    private String name;

    @Column(name = "e_gender")
    private String gender;

    @Column(name = "e_email")
    private String email;

    @Column(name = "e_password")
    private String password;

    @Column(name = "e_doj")
    private String doj;

    @Column(name = "e_location")
    private String location;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "dept_id")
    private Department department;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "mngr_id")
    private Manager manager;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "proj_id")
    private Project project;

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "emp_reim",
//    joinColumns = @JoinColumn(
//            name = "id", referencedColumnName = "id"),
//    inverseJoinColumns = @JoinColumn(
//            name = "id", referencedColumnName = "id"))
//    private Collection<Reimbursement> reimbursements;





    public Employee() {
    }

    public Employee(String name, String gender, String email, String password, String doj, String location, Department department, Manager manager, Project project) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.doj = doj;
        this.location = location;
        this.department = department;
        this.manager = manager;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
