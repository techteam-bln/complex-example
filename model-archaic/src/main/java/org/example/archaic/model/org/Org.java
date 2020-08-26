package org.example.archaic.model.org;

import org.example.archaic.model.common.ArchaicEntityInterface;

public class Org implements ArchaicEntityInterface {

  public final String[] DETAIL_NAMES = new String[0];

  private Long orgPk;

  private String orgName;

  private String orgType;

  private String lastChangeDate;

  private Long lastChangeUserId;

  public Long getOrgPk() {
   
	  
	  
	  
	  return orgPk;
  }

  public void setOrgPk(Long orgPk) {    this.orgPk = orgPk;  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public String getOrgType() {
    return orgType;
  }

  public void setOrgType(String orgType) {
    this.orgType = orgType;
  }

  @Override
  public Long getPk() {
    return getOrgPk();
  }

  @Override
  public void setPk(Long pk) {
    setOrgPk(pk);
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
