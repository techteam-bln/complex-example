package org.example.archaic.model.org;

import java.util.Vector;
import org.example.archaic.model.common.ArchaicCompoundInterface;
import org.example.archaic.model.common.ArchaicEntityInterface;

@SuppressWarnings("rawtypes")
public class OrgCompound implements ArchaicCompoundInterface {

  public final String[] DETAIL_NANES = new String[] {"ORG_TAX_DATA", "ORG_ADDRESS"};

  private Org baseEntity;

  private Vector orgAddress = new Vector();

  private OrgTaxData orgTaxData = null;

  public Vector getOrgAddress() {
    return orgAddress;
  }

  public void setOrgAddress(Vector orgAddress) {
    this.orgAddress = orgAddress;
  }

  public OrgTaxData getOrgTaxData() {
    return orgTaxData;
  }

  public void setOrgTaxData(OrgTaxData orgTaxData) {
    this.orgTaxData = orgTaxData;
  }

  @Override
  public ArchaicEntityInterface getBaseEntity() {
    return baseEntity;
  }

  @Override
  public void setBaseEntity(ArchaicEntityInterface baseEntity) {
    this.baseEntity = (Org) baseEntity;
  }

  @Override
  public String[] getDetailNames() {
    return DETAIL_NANES;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Vector getDetails(String detailName) {
    if ("ORG_ADDRESS".equals(detailName)) {
      return orgAddress;
    } else if ("ORG_TAX_DATA".equals(detailName)) {
      Vector v = new Vector();
      if (null != orgTaxData) {
        v.add(orgTaxData);
      }
      return v;
    }
    throw new IllegalArgumentException("No known detail: " + detailName);
  }

  @Override
  public void setDetails(String detailName, Vector details) {
    if ("ORG_ADDRESS".equals(detailName)) {
      orgAddress = details;
    } else if ("ORG_TAX_DATA".equals(detailName)) {
      orgTaxData = (OrgTaxData) details.elementAt(0);
    }
    throw new IllegalArgumentException("No known detail: " + detailName);
  }
}
