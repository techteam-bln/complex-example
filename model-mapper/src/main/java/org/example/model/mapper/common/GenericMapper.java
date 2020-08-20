package org.example.model.mapper.common;

import org.apache.commons.lang3.StringUtils;

public interface GenericMapper<A, E> {

  E toExample(A archaicObject);

  A toArchaic(E exampleObject);

  default String trimStringValues(String input) {
    return StringUtils.trim(input);
  }
}
