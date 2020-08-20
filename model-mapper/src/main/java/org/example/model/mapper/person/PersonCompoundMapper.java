package org.example.model.mapper.person;

import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import org.example.archaic.model.common.ArchaicEntityInterface;
import org.example.archaic.model.person.Person;
import org.example.archaic.model.person.PersonAddress;
import org.example.archaic.model.person.PersonCompound;
import org.example.archaic.model.person.PersonProfession;
import org.example.model.mapper.common.GenericMapper;
import org.example.model.mapper.common.RootMapperConfig;
import org.example.model.mapper.common.ToArchaicCompound;
import org.example.model.person.ExamplePerson;
import org.example.model.person.ExamplePersonAddress;
import org.example.model.person.ExamplePersonCompound;
import org.example.model.person.ExamplePersonProfession;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(config = RootMapperConfig.class, uses = PersonMapper.class)
public interface PersonCompoundMapper extends GenericMapper<PersonCompound, ExamplePersonCompound> {

  PersonCompoundMapper INSTANCE = Mappers.getMapper(PersonCompoundMapper.class);

  @Override
  @Mapping(source = "baseEntity", target = "person", qualifiedByName = "baseToExample")
  @Mapping(source = "personAddress", target = "personAddress", qualifiedByName = "addressToExample")
  @Mapping(
      source = "personProfession",
      target = "personProfession",
      qualifiedByName = "professionToExample")
  ExamplePersonCompound toExample(PersonCompound archaicObject);

  @Override
  @Mapping(source = "person", target = "baseEntity", resultType = Person.class)
  @Mapping(source = "personAddress", target = "personAddress", qualifiedByName = "addressToArchaic")
  @Mapping(
      source = "personProfession",
      target = "personProfession",
      qualifiedByName = "professionToArchaic")
  @ToArchaicCompound
  PersonCompound toArchaic(ExamplePersonCompound exampleObject);

  @Named("baseToExample")
  default ExamplePerson baseToExample(ArchaicEntityInterface base) {
    return PersonMapper.INSTANCE.toExample(Person.class.cast(base));
  }

  @SuppressWarnings("rawtypes")
  @Named("addressToArchaic")
  default Vector addressToArchaic(List<ExamplePersonAddress> source) {
    return new Vector<>(
        source.stream()
            .map(s -> PersonAddressMapper.INSTANCE.toArchaic(s))
            .collect(Collectors.toList()));
  }

  @SuppressWarnings("rawtypes")
  @Named("addressToExample")
  default List<ExamplePersonAddress> addressToExample(Vector source) {
    return Streams.stream(Iterables.filter(source, PersonAddress.class))
        .map(s -> PersonAddressMapper.INSTANCE.toExample(s))
        .collect(Collectors.toList());
  }

  @SuppressWarnings("rawtypes")
  @Named("professionToArchaic")
  default Vector professionToArchaic(List<ExamplePersonProfession> source) {
    return new Vector<>(
        source.stream()
            .map(s -> PersonProfessionMapper.INSTANCE.toArchaic(s))
            .collect(Collectors.toList()));
  }

  @SuppressWarnings("rawtypes")
  @Named("professionToExample")
  default List<ExamplePersonProfession> professionToExample(Vector source) {
    return Streams.stream(Iterables.filter(source, PersonProfession.class))
        .map(s -> PersonProfessionMapper.INSTANCE.toExample(s))
        .collect(Collectors.toList());
  }
}
