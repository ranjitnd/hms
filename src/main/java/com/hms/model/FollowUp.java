package com.hms.model;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 *
 * @author ranjitnd
 */
public class FollowUp {
    @Id
    private String id;
    private String notes;
    private String prescription;
    private String status;
    private Collection<Complaint> complaintCollection;
    private Remedy remedy;
    private String doctorId;
    private String kaseId;
    private Date lastUpdated;

//    private Kase kase;

    public FollowUp() {
    }

    public FollowUp(String id) {
        this.id = id;
    }

    public FollowUp(String id, Date lastUpdated) {
        this.id = id;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public Collection<Complaint> getComplaintCollection() {
        return complaintCollection;
    }

    public void setComplaintCollection(Collection<Complaint> complaintCollection) {
        this.complaintCollection = complaintCollection;
    }

    public Remedy getRemedy() {
        return remedy;
    }

    public void setRemedy(Remedy remedy) {
        this.remedy = remedy;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getKaseId() {
		return kaseId;
	}

	public void setKaseId(String kaseId) {
		this.kaseId = kaseId;
	}

	/*    public Kase getKase() {
        return kase;
    }

    public void setKase(Kase kase) {
        this.kase = kase;
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
        if (!(object instanceof FollowUp)) {
            return false;
        }
        FollowUp other = (FollowUp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Followup[ id=" + id + " ]";
    }
    
}
