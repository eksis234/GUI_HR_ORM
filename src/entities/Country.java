/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ignatius
 */
@Entity
@Table(name = "COUNTRIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c")
    , @NamedQuery(name = "Country.findByCountryId", query = "SELECT c FROM Country c WHERE c.countryId = :countryId")
    , @NamedQuery(name = "Country.findByCountryName", query = "SELECT c FROM Country c WHERE c.countryName = :countryName")})
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COUNTRY_ID")
    private String countryId;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @OneToMany(mappedBy = "countryId", fetch = FetchType.LAZY)
    private List<Location> locationList;
    @JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Region regionId;

    /**
     * konstraktor country
     */
    public Country() {
    }

    /**
     * dok kontraktor country id
     * @param countryId berupa string
     */
    public Country(String countryId) {
        this.countryId = countryId;
    }

    /**
     * dok get Countryid
     * @return get countryId
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * dok SetCountryId
     * @param countryId berupa string 
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
     * dok getCountryName
     * @return get countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * dok setCountryName
     * @param countryName berupa string 
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * doc List Location
     * @return get locationList
     */
    @XmlTransient
    public List<Location> getLocationList() {
        return locationList;
    }

    /**
     * dok locationList
     * @param locationList  berupa list locaation
     */
    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    /**
     * dok regionId
     * @return get regionId
     */
    public Region getRegionId() {
        return regionId;
    }

    /**
     * dok Region Id
     * @param regionId berupa object region
     */
    public void setRegionId(Region regionId) {
        this.regionId = regionId;
    }

    /**
     * dok hashcode
     * @return get hash
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    /**
     * dok equels
     * @param object berupa object
     * @return get hasil equqls
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    /**
     * dok tostring
     * @return get string
     */
    @Override
    public String toString() {
        return "entitas.Country[ countryId=" + countryId + " ]";
    }
    
}
