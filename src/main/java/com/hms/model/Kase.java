package com.hms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 *
 * @author ranjitnd
 */
public class Kase {
    @Id
    private String id;
    private String clinicalDiag;
    private String reports;
    private String drugs;
    private Date lastUpdated;
    private User doctor;
    private String patientId;
    private PhyGen phyGen;
    private Mind mind;
    private History history;
    //private Collection<FollowUp> followupCollection;

    public Kase() {
    }

    public Kase(String id) {
        this.id = id;
    }

    public Kase(String id, Date lastUpdated) {
        this.id = id;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClinicalDiag() {
        return clinicalDiag;
    }

    public void setClinicalDiag(String clinicalDiag) {
        this.clinicalDiag = clinicalDiag;
    }

    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatient(String patientId) {
        this.patientId = patientId;
    }

    public PhyGen getPhyGen() {
        return phyGen;
    }

    public void setPhyGen(PhyGen phyGen) {
        this.phyGen = phyGen;
    }

    public Mind getMind() {
        return mind;
    }

    public void setMind(Mind mind) {
        this.mind = mind;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
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
        if (!(object instanceof Kase)) {
            return false;
        }
        Kase other = (Kase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Kase[ id=" + id + " ]";
    }
    
}
