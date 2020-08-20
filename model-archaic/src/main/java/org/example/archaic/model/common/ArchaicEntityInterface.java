package org.example.archaic.model.common;

public interface ArchaicEntityInterface {
  Long getPk();

  void setPk(Long pk);

  String[] getDetailNames();

  String getLastChangeDate();

  void setLastChangeDate(String lastChangeDate);

  Long getLastChangeUserId();

  void setLastChangeUserId(Long lastChangeUserId);
}
