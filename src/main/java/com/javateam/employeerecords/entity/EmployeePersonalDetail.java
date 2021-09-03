package com.javateam.employeerecords.entity;


import javax.persistence.*;

@Entity
@Table(name="employee_personaldetails")
public class EmployeePersonalDetail {

    @Id
    @Column(name="emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(name="first_name")
    private String employeeFirstName;

    @Column(name="last_name")
    private String employeeLastName;

    @Column(name="mobile_no")
    private String mobileNo;


    public EmployeePersonalDetail(){}

    public EmployeePersonalDetail(String employeeFirstName, String employeeLastName, String mobileNo) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.mobileNo=mobileNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "EmployeePersonalDetail{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}

