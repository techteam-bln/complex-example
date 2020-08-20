# Complex example with JAXB and Mapstruct

This example contains 
* a module with an archaic domain model
* a module with a new clean model (generated with JAXB)
* a mapper module

##Current problems
If you activating the generation of fluent api inside the clean model module pom,
the mapper reports unmapped target properties. 

##Possible improvments
* defined mappers - handle some special cases with  the really ugly archaic model.