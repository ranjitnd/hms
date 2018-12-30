package com.hms.model;

import java.util.Date;

/**
 *
 * @author ranjitnd
 */
public class Remedy {
/*    @Id
    private String id;
*/    
    private String acute;
    private String chronic;
//    private String acuteHistory;
//    private String chronicHistory;
    private Date lastUpdated;

    //private Kase kase;

    public Remedy() {
    }

/*    public Remedy(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
*/
    public String getAcute() {
        return acute;
    }

    public void setAcute(String acute) {
        this.acute = acute;
    }

    public String getChronic() {
        return chronic;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic;
    }
/*
    public String getAcuteHistory() {
        return acuteHistory;
    }

    public void setAcuteHistory(String acuteHistory) {
        this.acuteHistory = acuteHistory;
    }

    public String getChronicHistory() {
        return chronicHistory;
    }

    public void setChronicHistory(String chronicHistory) {
        this.chronicHistory = chronicHistory;
    }
*/
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
/*
    public Kase getKase() {
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
        if (!(object instanceof Remedy)) {
            return false;
        }
        Remedy other = (Remedy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Remedy[ id=" + id + " ]";
    }
*/    
}
