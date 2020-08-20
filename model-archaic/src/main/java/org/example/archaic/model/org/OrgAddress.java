package org.example.archaic.model.org;

import org.example.archaic.model.common.ArchaicEntityInterface;

public class OrgAddress implements ArchaicEntityInterface {

  public final String[] DETAIL_NAMES = new String[0];

  private Long orgAddressPk;

  private String countryCode;

  private String postalCode;

  private String city;

  private String streetName;

  private String streetNum;

  private String lastChangeDate;

  private Long lastChangeUserId;

  public Long getOrgAddressPk() {
    return orgAddressPk;
  }

  public void setOrgAddressPk(Long personAddressPk) {
    this.orgAddressPk = personAddressPk;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getStreetNum() {
    return streetNum;
  }

  public void setStreetNum(String streetNum) {
    this.streetNum = streetNum;
  }

  @Override
  public Long getPk() {
    return getOrgAddressPk();
  }

  @Override
  public void setPk(Long pk) {
    setOrgAddressPk(pk);
  }

  @Override
  public String[] getDetailNames() {
    return DETAIL_NAMES;
  }

  @Override
  public String getLastChangeDate() {
    return lastChangeDate;
  }

  @Override
  public void setLastChangeDate(String lastChangeDate) {
    this.lastChangeDate = lastChangeDate;
  }

  @Override
  public Long getLastChangeUserId() {
    return lastChangeUserId;
  }

  @Override
  public void setLastChangeUserId(Long lastChangeUserId) {
    this.lastChangeUserId = lastChangeUserId;
  }
}
