package com.hms.model;

import java.util.Date;

/**
 *
 * @author ranjitnd
 */
public class Complaint {
/*    @Id
    private String id;
*/    
    private String title;
    private String duration;
    private String details;
    private String location;
    private String sensation;
    private String causation;
    private String concomitant;
    private String worse;
    private String better;
    private Date lastUpdated;
    //private Kase kase;

    public Complaint() {
    }

/*    public Complaint(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSensation() {
        return sensation;
    }

    public void setSensation(String sensation) {
        this.sensation = sensation;
    }

    public String getCausation() {
        return causation;
    }

    public void setCausation(String causation) {
        this.causation = causation;
    }

    public String getConcomitant() {
        return concomitant;
    }

    public void setConcomitant(String concomitant) {
        this.concomitant = concomitant;
    }

    public String getWorse() {
        return worse;
    }

    public void setWorse(String worse) {
        this.worse = worse;
    }

    public String getBetter() {
        return better;
    }

    public void setBetter(String better) {
        this.better = better;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

/*    public Kase getKase() {
        return kase;
    }

    public void setKase(Kase kase) {
        this.kase = kase;
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
        if (!(object instanceof Complaint)) {
            return false;
        }
        Complaint other = (Complaint) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Complaint[ id=" + id + " ]";
    }
*/    
}
