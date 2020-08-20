package org.example.archaic.model.org;

import org.example.archaic.model.common.ArchaicEntityInterface;

public class OrgTaxData implements ArchaicEntityInterface {

  public final String[] DETAIL_NAMES = new String[0];

  private long orgTaxDataPk;

  private String taxIdentificationNumber;

  private String localTaxOffice;

  private Long lastChangeUserId;

  private String lastChangeDate;

  public long getOrgTaxDataPk() {
    return orgTaxDataPk;
  }

  public void setOrgTaxDataPk(long orgTaxDataPk) {
    this.orgTaxDataPk = orgTaxDataPk;
  }

  public String getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }

  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }

  public String getLocalTaxOffice() {
    return localTaxOffice;
  }

  public void setLocalTaxOffice(String localTaxOffice) {
    this.localTaxOffice = localTaxOffice;
  }

  @Override
  public Long getPk() {
    return getOrgTaxDataPk();
  }

  @Override
  public void setPk(Long pk) {
    setOrgTaxDataPk(orgTaxDataPk);
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
