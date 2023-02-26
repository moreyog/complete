package com.example.accessingdatamysql;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserDto {

    private Integer id;

    private String firstname;

    private String lastname;

    private int mob1;

    private int mob2;

    private String email;

    private String proof;

    private String currentAddress;

    private String currentCity;

    @JsonFormat(pattern="dd/MM/yyyy")
    @JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
    private Date dob;

    private int birthHr;

    private int birthMin;

    private String birthAMPM;

    private Gender gender;

    private int heightFoot;

    private int heightInch;

    private Caste caste;

    private SubCaste subCaste;

    private OccupationType occupationType;

    private EducationSpecialization educationSpecialization;

    private String education;


    public UserDto(String firstname, String lastname, int mob1, int mob2, String email, String proof, String currentAddress, String currentCity, Date dob, int birthHr, int birthMin, String birthAMPM, Gender gender, int heightFoot, int heightInch, Caste caste, SubCaste subCaste, OccupationType occupationType, EducationSpecialization educationSpecialization, String education) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mob1 = mob1;
        this.mob2 = mob2;
        this.email = email;
        this.proof = proof;
        this.currentAddress = currentAddress;
        this.currentCity = currentCity;
        this.dob = dob;
        this.birthHr = birthHr;
        this.birthMin = birthMin;
        this.birthAMPM = birthAMPM;
        this.gender = gender;
        this.heightFoot = heightFoot;
        this.heightInch = heightInch;
        this.caste = caste;
        this.subCaste = subCaste;
        this.occupationType = occupationType;
        this.educationSpecialization = educationSpecialization;
        this.education = education;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mob1=" + mob1 +
                ", mob2=" + mob2 +
                ", email='" + email + '\'' +
                ", proof='" + proof + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", currentCity='" + currentCity + '\'' +
                ", dob=" + dob +
                ", birthHr=" + birthHr +
                ", birthMin=" + birthMin +
                ", birthAMPM=" + birthAMPM +
                ", gender=" + gender +
                ", heightFoot=" + heightFoot +
                ", heightInch=" + heightInch +
                ", caste=" + caste +
                ", subCaste=" + subCaste +
                ", occupationType=" + occupationType +
                ", educationSpecialization=" + educationSpecialization +
                ", education='" + education + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getMob1() {
        return mob1;
    }

    public void setMob1(int mob1) {
        this.mob1 = mob1;
    }

    public int getMob2() {
        return mob2;
    }

    public void setMob2(int mob2) {
        this.mob2 = mob2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getBirthHr() {
        return birthHr;
    }

    public void setBirthHr(int birthHr) {
        this.birthHr = birthHr;
    }

    public int getBirthMin() {
        return birthMin;
    }

    public void setBirthMin(int birthMin) {
        this.birthMin = birthMin;
    }

    public String getBirthAMPM() {
        return birthAMPM;
    }

    public void setBirthAMPM(String birthAMPM) {
        this.birthAMPM = birthAMPM;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getHeightFoot() {
        return heightFoot;
    }

    public void setHeightFoot(int heightFoot) {
        this.heightFoot = heightFoot;
    }

    public int getHeightInch() {
        return heightInch;
    }

    public void setHeightInch(int heightInch) {
        this.heightInch = heightInch;
    }

    public Caste getCaste() {
        return caste;
    }

    public void setCaste(Caste caste) {
        this.caste = caste;
    }

    public SubCaste getSubCaste() {
        return subCaste;
    }

    public void setSubCaste(SubCaste subCaste) {
        this.subCaste = subCaste;
    }

    public OccupationType getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(OccupationType occupationType) {
        this.occupationType = occupationType;
    }

    public EducationSpecialization getEducationSpecialization() {
        return educationSpecialization;
    }

    public void setEducationSpecialization(EducationSpecialization educationSpecialization) {
        this.educationSpecialization = educationSpecialization;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
