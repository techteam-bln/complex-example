package org.example.archaic.model.common;

import java.util.Vector;

@SuppressWarnings("rawtypes")
public interface ArchaicCompoundInterface {

  ArchaicEntityInterface getBaseEntity();

  void setBaseEntity(ArchaicEntityInterface baseEntity);

  String[] getDetailNames();

  Vector getDetails(String detailName);

  void setDetails(String detailName, Vector details);
}
