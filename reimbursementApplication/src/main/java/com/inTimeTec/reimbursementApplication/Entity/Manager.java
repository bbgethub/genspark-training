package com.inTimeTec.reimbursementApplication.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_managers")
public class Manager {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mngr_seq")
    @SequenceGenerator(name="mngr_seq",initialValue = 3001, allocationSize=1 )
    @Column(name="m_id")
    private int id;

    private String nameMngr;

    public Manager() {
    }

    public Manager(String nameMngr) {
        this.nameMngr = nameMngr;
    }

    public int getId() {
        return id;
    }

    public String getNameMngr() {
        return nameMngr;
    }

    public void setNameMngr(String nameMngr) {
        this.nameMngr = nameMngr;
    }
}
