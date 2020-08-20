package org.example.archaic.model.person;

import java.util.Vector;
import org.example.archaic.model.common.ArchaicCompoundInterface;
import org.example.archaic.model.common.ArchaicEntityInterface;

@SuppressWarnings("rawtypes")
public class PersonCompound implements ArchaicCompoundInterface {

  public final String[] DETAIL_NAMES = new String[] {"PERSON_ADDRESS", "PERSON_PROFESSION"};

  private Person baseEntity;

  private Vector personAddress = new Vector();

  private Vector personProfession = new Vector();

  @Override
  public ArchaicEntityInterface getBaseEntity() {
    return baseEntity;
  }

  @Override
  public void setBaseEntity(ArchaicEntityInterface baseEntity) {
    this.baseEntity = (Person) baseEntity;
  }

  @Override
  public String[] getDetailNames() {
    return DETAIL_NAMES;
  }

  @Override
  public Vector getDetails(String detailName) {
    if ("PERSON_ADDRESS".equals(detailName)) {
      return personAddress;
    } else if ("PERSON_PROFESSION".equals(detailName)) {
      return personProfession;
    }
    throw new IllegalArgumentException("No known detail: " + detailName);
  }

  @Override
  public void setDetails(String detailName, Vector details) {
    if ("PERSON_ADDRESS".equals(detailName)) {
      personAddress = details;
    } else if ("PERSON_PROFESSION".equals(detailName)) {
      personProfession = details;
    }
    throw new IllegalArgumentException("No known detail: " + detailName);
  }

  public Vector getPersonAddress() {
    return personAddress;
  }

  public void setPersonAddress(Vector personaAddress) {
    this.personAddress = personaAddress;
  }

  public Vector getPersonProfession() {
    return personProfession;
  }

  public void setPersonProfession(Vector personProfession) {
    this.personProfession = personProfession;
  }
}
