package com.inTimeTec.reimbursementApplication.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_projects")
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="proj_seq")
    @SequenceGenerator(name="proj_seq",initialValue = 4001, allocationSize=1 )
    @Column(name="p_id")
    private int id;

    private String projName;
    private String projLocation;
    private String projStartDate;

    public Project() {
    }

    public Project(String projName, String projLocation, String projStartDate) {
        this.projName = projName;
        this.projLocation = projLocation;
        this.projStartDate = projStartDate;
    }

    public int getId() {
        return id;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjLocation() {
        return projLocation;
    }

    public void setProjLocation(String projLocation) {
        this.projLocation = projLocation;
    }

    public String getProjStartDate() {
        return projStartDate;
    }

    public void setProjStartDate(String projStartDate) {
        this.projStartDate = projStartDate;
    }
}
