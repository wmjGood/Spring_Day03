package mybatis_spring.pojo;


import java.io.Serializable;
import java.sql.Timestamp;

public class SmbmsProvider implements Serializable {

  private int id;
  private String proCode;
  private String proName;
  private String proDesc;
  private String proContact;
  private String proPhone;
  private String proAddress;
  private String proFax;
  private long createdBy;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;
  private long modifyBy;

  public SmbmsProvider(int id, String proCode, String proName, String proDesc, String proContact, String proPhone, String proAddress, String proFax, long createdBy, Timestamp creationDate, Timestamp modifyDate, long modifyBy) {
    this.id = id;
    this.proCode = proCode;
    this.proName = proName;
    this.proDesc = proDesc;
    this.proContact = proContact;
    this.proPhone = proPhone;
    this.proAddress = proAddress;
    this.proFax = proFax;
    this.createdBy = createdBy;
    this.creationDate = creationDate;
    this.modifyDate = modifyDate;
    this.modifyBy = modifyBy;
  }

  public SmbmsProvider() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getProCode() {
    return proCode;
  }

  public void setProCode(String proCode) {
    this.proCode = proCode;
  }


  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }


  public String getProDesc() {
    return proDesc;
  }

  public void setProDesc(String proDesc) {
    this.proDesc = proDesc;
  }


  public String getProContact() {
    return proContact;
  }

  public void setProContact(String proContact) {
    this.proContact = proContact;
  }


  public String getProPhone() {
    return proPhone;
  }

  public void setProPhone(String proPhone) {
    this.proPhone = proPhone;
  }


  public String getProAddress() {
    return proAddress;
  }

  public void setProAddress(String proAddress) {
    this.proAddress = proAddress;
  }


  public String getProFax() {
    return proFax;
  }

  public void setProFax(String proFax) {
    this.proFax = proFax;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }

  @Override
  public String toString() {
    return "SmbmsProvider{" +
            "id=" + id +
            ", proCode='" + proCode + '\'' +
            ", proName='" + proName + '\'' +
            ", proDesc='" + proDesc + '\'' +
            ", proContact='" + proContact + '\'' +
            ", proPhone='" + proPhone + '\'' +
            ", proAddress='" + proAddress + '\'' +
            ", proFax='" + proFax + '\'' +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyDate=" + modifyDate +
            ", modifyBy=" + modifyBy +
            '}';
  }
}
