/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sango
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p")
    , @NamedQuery(name = "Products.findById", query = "SELECT p FROM Products p WHERE p.id = :id")
    , @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name")
    , @NamedQuery(name = "Products.findByCost", query = "SELECT p FROM Products p WHERE p.cost = :cost")
    , @NamedQuery(name = "Products.findByDownloadNumber", query = "SELECT p FROM Products p WHERE p.downloadNumber = :downloadNumber")
    , @NamedQuery(name = "Products.findByPicLink", query = "SELECT p FROM Products p WHERE p.picLink = :picLink")
    , @NamedQuery(name = "Products.findByDownloadLink", query = "SELECT p FROM Products p WHERE p.downloadLink = :downloadLink")
    , @NamedQuery(name = "Products.findByDateCreated", query = "SELECT p FROM Products p WHERE p.dateCreated = :dateCreated")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cost")
    private int cost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DownloadNumber")
    private int downloadNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "PicLink")
    private String picLink;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DownloadLink")
    private String downloadLink;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreated")
    @Temporal(TemporalType.DATE)
    private Date dateCreated;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private List<Mylist> mylistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private List<Cart> cartList;

    public Products() {
    }

    public Products(Integer id) {
        this.id = id;
    }

    public Products(Integer id, String name, int cost, int downloadNumber, String picLink, String downloadLink, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.downloadNumber = downloadNumber;
        this.picLink = picLink;
        this.downloadLink = downloadLink;
        this.dateCreated = dateCreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    public String getPicLink() {
        return picLink;
    }

    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @XmlTransient
    public List<Mylist> getMylistList() {
        return mylistList;
    }

    public void setMylistList(List<Mylist> mylistList) {
        this.mylistList = mylistList;
    }

    @XmlTransient
    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
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
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Products[ id=" + id + " ]";
    }
    
}
