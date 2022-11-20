package com.example.portfolioBE.mapper;

public interface ModelMapperDtoToEntity<D, E> {

  E toEntity(D d);
}
