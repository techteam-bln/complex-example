package org.example.model.mapper.common;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
    mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG,
    collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
    unmappedTargetPolicy = ReportingPolicy.ERROR)
//		unmappedSourcePolicy = ReportingPolicy.WARN)
public interface RootMapperConfig {}
