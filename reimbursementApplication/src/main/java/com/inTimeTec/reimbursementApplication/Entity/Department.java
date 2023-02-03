package com.inTimeTec.reimbursementApplication.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_departments")
public class Department {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="dept_seq")
    @SequenceGenerator(name="dept_seq",initialValue = 2001, allocationSize=1 )
    @Column(name = "d_id")
    private int id;

    private String deptName;

    public Department() {
    }

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
