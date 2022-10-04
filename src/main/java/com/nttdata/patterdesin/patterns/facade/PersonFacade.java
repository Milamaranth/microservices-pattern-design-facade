package com.nttdata.patterdesin.patterns.facade;

import java.util.List;

import com.nttdata.patterdesin.patterns.domain.Person;

public class PersonFacade{
    
    private final List<Person> personas;

    //facade.startEngine();

    public PersonFacade(){
 
        personas = List.of(
            new Person("Mila",53),
            new Person("Alba",26),
            new Person("Mario",45),
            new Person("Juan",21)
        );

    }

    public List<Person> PersonasEntre20Y30(){
        // Hacemos una lambda
        List<Person> lista = personas.stream().filter(x -> 20<= x.getAge() && x.getAge() <= 30).toList();
        return lista;
    }

    
    //facade.stopEngine();




}
