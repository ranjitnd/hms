package com.hms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 *
 * @author ranjitnd
 */
public class Patient  {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNo;
    private String emailId;
    private String gender;
    private Date dateOfBirth;
    private short age;
    private String maritalStatus;
    private short children;
    private short siblings;
    private String education;
    private String occupation;
    private Date lastUpdated;
/*
    private History history;
    private Kase kase;
    private User assignedDoctor;

    private Collection<Invoice> invoiceCollection;
*/
    public Patient() {
    }

    public Patient(String id) {
        this.id = id;
    }

    public Patient(String id, String firstName, String lastName, String address, String gender, Date dateOfBirth, short age, String maritalStatus, short children, short siblings, String education, String occupation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.children = children;
        this.siblings = siblings;
        this.education = education;
        this.occupation = occupation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public short getChildren() {
        return children;
    }

    public void setChildren(short children) {
        this.children = children;
    }

    public short getSiblings() {
        return siblings;
    }

    public void setSiblings(short siblings) {
        this.siblings = siblings;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

/*    @XmlTransient
    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
    
    @XmlTransient
    public Kase getKase() {
        return kase;
    }

    public void setKase(Kase kase) {
        this.kase = kase;
    }
    
    @XmlTransient
    public User getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(User assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    @XmlTransient
    public Collection<Invoice> getInvoiceCollection() {
        return invoiceCollection;
    }

    public void setInvoiceCollection(Collection<Invoice> invoiceCollection) {
        this.invoiceCollection = invoiceCollection;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Patient[ id=" + id + " ]";
    }
    
}
