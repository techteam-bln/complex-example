package org.example.model.mapper.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.mapstruct.Mapping;

@Retention(RetentionPolicy.CLASS)
@Mapping(target = "DETAIL_NAMES", ignore = true)
public @interface ToArchaicCompound {}
