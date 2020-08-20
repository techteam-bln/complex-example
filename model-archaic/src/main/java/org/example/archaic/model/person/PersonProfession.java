package org.example.archaic.model.person;

import org.example.archaic.model.common.ArchaicEntityInterface;

public class PersonProfession implements ArchaicEntityInterface {

  public final String[] DETAIL_NAMES = new String[0];

  private Long personProfessionPk;

  private String profession;

  private String promoationDate;

  private String title;

  private String lastChangeDate;

  private Long lastChangeUserId;

  public Long getPersonProfessionPk() {
    return personProfessionPk;
  }

  public void setPersonProfessionPk(Long personProfessionPk) {
    this.personProfessionPk = personProfessionPk;
  }

  @Override
  public void setPk(Long pk) {
    setPersonProfessionPk(pk);
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public String getPromoationDate() {
    return promoationDate;
  }

  public void setPromoationDate(String promoationDate) {
    this.promoationDate = promoationDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public Long getPk() {
    return getPersonProfessionPk();
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
