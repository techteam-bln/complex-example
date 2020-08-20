package org.example.model.mapper.person;

import org.example.archaic.model.person.PersonProfession;
import org.example.model.mapper.common.GenericMapper;
import org.example.model.mapper.common.RootMapperConfig;
import org.example.model.mapper.common.ToArchaicEntity;
import org.example.model.person.ExamplePersonProfession;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = RootMapperConfig.class)
public interface PersonProfessionMapper
    extends GenericMapper<PersonProfession, ExamplePersonProfession> {

  PersonProfessionMapper INSTANCE = Mappers.getMapper(PersonProfessionMapper.class);

  @Override
  @Mapping(source = "promoationDate", target = "promotionDate")
  ExamplePersonProfession toExample(PersonProfession archaicObject);

  @Override
  @ToArchaicEntity
  @Mapping(source = "promotionDate", target = "promoationDate")
  PersonProfession toArchaic(ExamplePersonProfession exampleObject);
}
