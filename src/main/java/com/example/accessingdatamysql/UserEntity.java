package com.example.accessingdatamysql;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "usertest")
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String firstname;

	private String lastname;

	private int mob1;

	private int mob2;

	private String email;

	private String proof;

	private String currentAddress;

	private String currentCity;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dob;

	private int birthHr;

	private int birthMin;

	private String birthAMPM;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	private int heightFoot;

	private int heightInch;

	@Enumerated(EnumType.STRING)
	private Caste caste;

	@Enumerated(EnumType.STRING)
	private SubCaste subCaste;

	@Enumerated(EnumType.STRING)
	private EducationSpecialization educationSpecialization;

    //Free Text Field
	private String education;

	@Enumerated(EnumType.STRING)
	private OccupationType occupationType;

	private String occupation;

	private int weight;

	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;

	private boolean spectacle;

	private boolean lens;

	@Enumerated(EnumType.STRING)
	private Complexion complexion;

	private String birthPlace;

	@Enumerated(EnumType.STRING)
	private Diet diet;

	private boolean isFatherAlive;

	private boolean isMotherAlive;

	private int noOfBrother;

	private int noOfSister;

	private int noOfMarriedBrother;

	private int noOfMarriedSister;

	private String mamaSirNamePlace;

	private String relatives;

	private String parentResidingIn;

	private String parentFullName;

	private String parentOccupation;

	private  String nativePlace;

	private District district;

	private String familyWealth;

	private int expectedMaxAgeDiff;

	private int expectedHeightFeet;

	private int expectedHeightInch;

	private String expectedEducation;

	private String expectedPreferredCity;

	private String expectedOccupation;

	private String expectedCaste;

	private boolean divorcee;

	private MaritialStatus maritialStatus;

	private String devak;

	@Enumerated(EnumType.STRING)
	private Nakshtra nakshtra;

	@Enumerated(EnumType.STRING)
	private Rashi rashi;

	private boolean mangal;

	@Enumerated(EnumType.STRING)
	private Charan charan;

	@Enumerated(EnumType.STRING)
	private Nadi nadi;

	@Enumerated(EnumType.STRING)
	private Gan gan;

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

	public OccupationType getOccupationType() {
		return occupationType;
	}

	public void setOccupationType(OccupationType occupationType) {
		this.occupationType = occupationType;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public boolean isSpectacle() {
		return spectacle;
	}

	public void setSpectacle(boolean spectacle) {
		this.spectacle = spectacle;
	}

	public boolean isLens() {
		return lens;
	}

	public void setLens(boolean lens) {
		this.lens = lens;
	}

	public Complexion getComplexion() {
		return complexion;
	}

	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public boolean isFatherAlive() {
		return isFatherAlive;
	}

	public void setFatherAlive(boolean fatherAlive) {
		isFatherAlive = fatherAlive;
	}

	public boolean isMotherAlive() {
		return isMotherAlive;
	}

	public void setMotherAlive(boolean motherAlive) {
		isMotherAlive = motherAlive;
	}

	public int getNoOfBrother() {
		return noOfBrother;
	}

	public void setNoOfBrother(int noOfBrother) {
		this.noOfBrother = noOfBrother;
	}

	public int getNoOfSister() {
		return noOfSister;
	}

	public void setNoOfSister(int noOfSister) {
		this.noOfSister = noOfSister;
	}

	public int getNoOfMarriedBrother() {
		return noOfMarriedBrother;
	}

	public void setNoOfMarriedBrother(int noOfMarriedBrother) {
		this.noOfMarriedBrother = noOfMarriedBrother;
	}

	public int getNoOfMarriedSister() {
		return noOfMarriedSister;
	}

	public void setNoOfMarriedSister(int noOfMarriedSister) {
		this.noOfMarriedSister = noOfMarriedSister;
	}

	public String getMamaSirNamePlace() {
		return mamaSirNamePlace;
	}

	public void setMamaSirNamePlace(String mamaSirNamePlace) {
		this.mamaSirNamePlace = mamaSirNamePlace;
	}

	public String getRelatives() {
		return relatives;
	}

	public void setRelatives(String relatives) {
		this.relatives = relatives;
	}

	public String getParentResidingIn() {
		return parentResidingIn;
	}

	public void setParentResidingIn(String parentResidingIn) {
		this.parentResidingIn = parentResidingIn;
	}

	public String getParentFullName() {
		return parentFullName;
	}

	public void setParentFullName(String parentFullName) {
		this.parentFullName = parentFullName;
	}

	public String getParentOccupation() {
		return parentOccupation;
	}

	public void setParentOccupation(String parentOccupation) {
		this.parentOccupation = parentOccupation;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getFamilyWealth() {
		return familyWealth;
	}

	public void setFamilyWealth(String familyWealth) {
		this.familyWealth = familyWealth;
	}

	public int getExpectedMaxAgeDiff() {
		return expectedMaxAgeDiff;
	}

	public void setExpectedMaxAgeDiff(int expectedMaxAgeDiff) {
		this.expectedMaxAgeDiff = expectedMaxAgeDiff;
	}

	public int getExpectedHeightFeet() {
		return expectedHeightFeet;
	}

	public void setExpectedHeightFeet(int expectedHeightFeet) {
		this.expectedHeightFeet = expectedHeightFeet;
	}

	public int getExpectedHeightInch() {
		return expectedHeightInch;
	}

	public void setExpectedHeightInch(int expectedHeightInch) {
		this.expectedHeightInch = expectedHeightInch;
	}

	public String getExpectedEducation() {
		return expectedEducation;
	}

	public void setExpectedEducation(String expectedEducation) {
		this.expectedEducation = expectedEducation;
	}

	public String getExpectedPreferredCity() {
		return expectedPreferredCity;
	}

	public void setExpectedPreferredCity(String expectedPreferredCity) {
		this.expectedPreferredCity = expectedPreferredCity;
	}

	public String getExpectedOccupation() {
		return expectedOccupation;
	}

	public void setExpectedOccupation(String expectedOccupation) {
		this.expectedOccupation = expectedOccupation;
	}

	public String getExpectedCaste() {
		return expectedCaste;
	}

	public void setExpectedCaste(String expectedCaste) {
		this.expectedCaste = expectedCaste;
	}

	public boolean isDivorcee() {
		return divorcee;
	}

	public void setDivorcee(boolean divorcee) {
		this.divorcee = divorcee;
	}

	public MaritialStatus getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(MaritialStatus maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getDevak() {
		return devak;
	}

	public void setDevak(String devak) {
		this.devak = devak;
	}

	public Nakshtra getNakshtra() {
		return nakshtra;
	}

	public void setNakshtra(Nakshtra nakshtra) {
		this.nakshtra = nakshtra;
	}

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

	public boolean isMangal() {
		return mangal;
	}

	public void setMangal(boolean mangal) {
		this.mangal = mangal;
	}

	public Charan getCharan() {
		return charan;
	}

	public void setCharan(Charan charan) {
		this.charan = charan;
	}

	public Nadi getNadi() {
		return nadi;
	}

	public void setNadi(Nadi nadi) {
		this.nadi = nadi;
	}

	public Gan getGan() {
		return gan;
	}

	public void setGan(Gan gan) {
		this.gan = gan;
	}
}
