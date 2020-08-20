package org.example.model.mapper.person;

import org.example.archaic.model.person.Person;
import org.example.model.mapper.common.GenericMapper;
import org.example.model.mapper.common.RootMapperConfig;
import org.example.model.mapper.common.ToArchaicEntity;
import org.example.model.person.ExamplePerson;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = RootMapperConfig.class)
public interface PersonMapper extends GenericMapper<Person, ExamplePerson> {

  PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

  @Override
  ExamplePerson toExample(Person archaicObject);

  @Override
  @ToArchaicEntity
  Person toArchaic(ExamplePerson exampleObject);
}
