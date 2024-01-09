package com.example.democonsultorio.repository.ports;

public interface Mappable<T>  {

    T mapToDomain();
    T mapToEntity();
}
