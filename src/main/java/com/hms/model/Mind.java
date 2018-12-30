package com.hms.model;

import java.util.Date;

/**
 *
 * @author ranjitnd
 */
public class Mind {
/*    @Id
    private String id;
*/    
    private String details;
    private Date lastUpdated;
    //private Kase kase;

    public Mind() {
    }

/*    public Mind(String id) {
        this.id = id;
    }

    public Mind(String id, Date lastUpdated) {
        this.id = id;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
*/
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        if (!(object instanceof Mind)) {
            return false;
        }
        Mind other = (Mind) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mind[ id=" + id + " ]";
    }
*/    
}
