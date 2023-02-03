package com.inTimeTec.reimbursementApplication.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;

@Entity
@Table(name = "tbl_reimbursements")
public class Reimbursement {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="reim_seq")
    @SequenceGenerator(name="reim_seq",initialValue = 5001, allocationSize=1 )
    @Column(name="reim_id")
    private int id;

    @Column(name="reim_amount")
    private long reimAmount;

    @Column(name="reim_type")
    private String reimType;

    @Column(name="reim_recurring")
    private int reimRecurring;

    @Column(name = "from_date")
    private String fromDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name="reim_status")
    private String reimStatus;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "emp_id")
    private Employee employee;

    public Reimbursement() {
    }

    public Reimbursement(long reimAmount, String reimType, int reimRecurring, String fromDate, String endDate, String reimStatus, Employee employee) {
        this.reimAmount = reimAmount;
        this.reimType = reimType;
        this.reimRecurring = reimRecurring;
        this.fromDate = fromDate;
        this.endDate = endDate;
        this.reimStatus = reimStatus;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public long getReimAmount() {
        return reimAmount;
    }

    public void setReimAmount(long reimAmount) {
        this.reimAmount = reimAmount;
    }

    public String getReimType() {
        return reimType;
    }

    public void setReimType(String reimType) {
        this.reimType = reimType;
    }

    public int getReimRecurring() {
        return reimRecurring;
    }

    public void setReimRecurring(int reimRecurring) {
        this.reimRecurring = reimRecurring;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReimStatus() {
        return reimStatus;
    }

    public void setReimStatus(String reimStatus) {
        this.reimStatus = reimStatus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "id=" + id +
                ", reimAmount=" + reimAmount +
                ", reimType='" + reimType + '\'' +
                ", reimRecurring=" + reimRecurring +
                ", fromDate='" + fromDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", reimStatus='" + reimStatus + '\'' +
                ", employee=" + employee +
                '}';
    }
}
