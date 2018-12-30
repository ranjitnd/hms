package com.hms.model;

import java.util.Date;

/**
 *
 * @author ranjitnd
 */
public class History {
/*    @Id
    private String id;
*/
	private String self;
    private String treatment;
    private String father;
    private String mother;
    private String brother;
    private String sister;
    private String pGrandFather;
    private String pGrandMother;
    private String mGrandFather;
    private String mGrandMother;
    private Date lastUpdated;
    //private Patient patient;

    public History() {
    }

/*    public History(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
*/
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public String getSister() {
        return sister;
    }

    public void setSister(String sister) {
        this.sister = sister;
    }

    public String getPGrandFather() {
        return pGrandFather;
    }

    public void setPGrandFather(String pGrandFather) {
        this.pGrandFather = pGrandFather;
    }

    public String getPGrandMother() {
        return pGrandMother;
    }

    public void setPGrandMother(String pGrandMother) {
        this.pGrandMother = pGrandMother;
    }

    public String getMGrandFather() {
        return mGrandFather;
    }

    public void setMGrandFather(String mGrandFather) {
        this.mGrandFather = mGrandFather;
    }

    public String getMGrandMother() {
        return mGrandMother;
    }

    public void setMGrandMother(String mGrandMother) {
        this.mGrandMother = mGrandMother;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

/*    @XmlTransient
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof History)) {
            return false;
        }
        History other = (History) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.History[ id=" + id + " ]";
    }
*/
}
