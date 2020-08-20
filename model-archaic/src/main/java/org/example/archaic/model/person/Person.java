package org.example.archaic.model.person;

import org.example.archaic.model.common.ArchaicEntityInterface;

public class Person implements ArchaicEntityInterface {

  public final String[] DETAIL_NAMES = new String[0];

  private Long personPk;

  private String lastName;

  private String middleName;

  private String firstName;

  private String gender;

  private String birthday;

  private String deathday;

  private String lastChangeDate;

  private Long lastChangeUserId;

  public Long getPersonPk() {
    return personPk;
  }

  @Override
  public void setPk(Long pk) {
    setPersonPk(pk);
  }

  public void setPersonPk(Long personPk) {
    this.personPk = personPk;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getDeathday() {
    return deathday;
  }

  public void setDeathday(String deathday) {
    this.deathday = deathday;
  }

  @Override
  public Long getPk() {
    return getPersonPk();
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
