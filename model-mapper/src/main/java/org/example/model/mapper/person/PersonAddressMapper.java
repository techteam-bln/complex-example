package org.example.model.mapper.person;

import org.example.archaic.model.person.PersonAddress;
import org.example.model.mapper.common.GenericMapper;
import org.example.model.mapper.common.RootMapperConfig;
import org.example.model.mapper.common.ToArchaicEntity;
import org.example.model.person.ExamplePersonAddress;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = RootMapperConfig.class)
public interface PersonAddressMapper extends GenericMapper<PersonAddress, ExamplePersonAddress> {

  PersonAddressMapper INSTANCE = Mappers.getMapper(PersonAddressMapper.class);

  @Override
  ExamplePersonAddress toExample(PersonAddress archaicObject);

  @Override
  @ToArchaicEntity
  PersonAddress toArchaic(ExamplePersonAddress exampleObject);
}
