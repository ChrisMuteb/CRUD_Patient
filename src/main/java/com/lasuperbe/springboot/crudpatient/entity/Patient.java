package com.lasuperbe.springboot.crudpatient.entity;

import jakarta.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pat_num_HC")
    private long patNumHC;

    @Column(name = "pat_lastname")
    private String patLastName;

    @Column(name = "pat_firstname")
    private String patFirstName;

    @Column(name = "pat_address")
    private String patAddress;

    @Column(name = "pat_tel")
    private String patTel;

    @Column(name = "pat_insurance_id")
    private int patInsuranceId;

    @Column(name = "pat_subscription_date")
    private String patSubscriptionData;

    // define constructors

    public Patient() {
    }

    public Patient(String patLastName, String patFirstName, String patAddress, String patTel, int patInsuranceId, String patSubscriptionData) {
        this.patLastName = patLastName;
        this.patFirstName = patFirstName;
        this.patAddress = patAddress;
        this.patTel = patTel;
        this.patInsuranceId = patInsuranceId;
        this.patSubscriptionData = patSubscriptionData;
    }

    // define getter/setter

    public long getPatNumHC() {
        return patNumHC;
    }

    public void setPatNumHC(long patNumHC) {
        this.patNumHC = patNumHC;
    }

    public String getPatLastName() {
        return patLastName;
    }

    public void setPatLastName(String patLastName) {
        this.patLastName = patLastName;
    }

    public String getPatFirstName() {
        return patFirstName;
    }

    public void setPatFirstName(String patFirstName) {
        this.patFirstName = patFirstName;
    }

    public String getPatAddress() {
        return patAddress;
    }

    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    public String getPatTel() {
        return patTel;
    }

    public void setPatTel(String patTel) {
        this.patTel = patTel;
    }

    public int getPatInsuranceId() {
        return patInsuranceId;
    }

    public void setPatInsuranceId(int patInsuranceId) {
        this.patInsuranceId = patInsuranceId;
    }

    public String getPatSubscriptionData() {
        return patSubscriptionData;
    }

    public void setPatSubscriptionData(String patSubscriptionData) {
        this.patSubscriptionData = patSubscriptionData;
    }

    // define toString

    @Override
    public String toString() {
        return "Patient{" +
                "patNumHC=" + patNumHC +
                ", patLastName='" + patLastName + '\'' +
                ", patFirstName='" + patFirstName + '\'' +
                ", patAddress='" + patAddress + '\'' +
                ", patTel='" + patTel + '\'' +
                ", patInsuranceId=" + patInsuranceId +
                ", patSubscriptionData='" + patSubscriptionData + '\'' +
                '}';
    }
}
