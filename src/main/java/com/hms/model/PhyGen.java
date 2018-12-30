package com.hms.model;

import java.util.Date;

/**
 *
 * @author ranjitnd
 */
public class PhyGen {
/*    @Id
    private String id;
*/    
    private String built;
    private String appetite;
    private String thirst;
    private String diet;
    private String foodDesires;
    private String foodAversion;
    private String foodDisagree;
    private String stool;
    private String urination;
    private String sleep;
    private String dreams;
    private String sweat;
    private String thermals;
    private String hobbies;
    private String menstruation;
    private String sex;
    private String phyObservation;
    private Date lastUpdated;

    private Kase kase;

    public PhyGen() {
    }

/*    public PhyGen(String id) {
        this.id = id;
    }

    public PhyGen(String id, Date lastUpdated) {
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
    public String getBuilt() {
        return built;
    }

    public void setBuilt(String built) {
        this.built = built;
    }

    public String getAppetite() {
        return appetite;
    }

    public void setAppetite(String appetite) {
        this.appetite = appetite;
    }

    public String getThirst() {
        return thirst;
    }

    public void setThirst(String thirst) {
        this.thirst = thirst;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getFoodDesires() {
        return foodDesires;
    }

    public void setFoodDesires(String foodDesires) {
        this.foodDesires = foodDesires;
    }

    public String getFoodAversion() {
        return foodAversion;
    }

    public void setFoodAversion(String foodAversion) {
        this.foodAversion = foodAversion;
    }

    public String getFoodDisagree() {
        return foodDisagree;
    }

    public void setFoodDisagree(String foodDisagree) {
        this.foodDisagree = foodDisagree;
    }

    public String getStool() {
        return stool;
    }

    public void setStool(String stool) {
        this.stool = stool;
    }

    public String getUrination() {
        return urination;
    }

    public void setUrination(String urination) {
        this.urination = urination;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getDreams() {
        return dreams;
    }

    public void setDreams(String dreams) {
        this.dreams = dreams;
    }

    public String getSweat() {
        return sweat;
    }

    public void setSweat(String sweat) {
        this.sweat = sweat;
    }

    public String getThermals() {
        return thermals;
    }

    public void setThermals(String thermals) {
        this.thermals = thermals;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getMestruation() {
        return menstruation;
    }

    public void setMestruation(String mestruation) {
        this.menstruation = mestruation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhyObservation() {
        return phyObservation;
    }

    public void setPhyObservation(String phyObservation) {
        this.phyObservation = phyObservation;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Kase getKase() {
        return kase;
    }

    public void setKase(Kase kase) {
        this.kase = kase;
    }

/*    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhyGen)) {
            return false;
        }
        PhyGen other = (PhyGen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PhyGen[ id=" + id + " ]";
    }
*/    
}
