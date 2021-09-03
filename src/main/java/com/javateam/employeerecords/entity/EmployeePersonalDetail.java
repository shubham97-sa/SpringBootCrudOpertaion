package com.javateam.employeerecords.entity;

public class EmployeePersonalDetail {
    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String mobileNo;

    public EmployeePersonalDetail(){

    }

    public EmployeePersonalDetail(String employeeFirstName, String employeeLastName, String mobileNo) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.mobileNo = mobileNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
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
