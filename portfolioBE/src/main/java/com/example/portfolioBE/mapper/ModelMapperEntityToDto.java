package com.example.portfolioBE.mapper;

public interface ModelMapperEntityToDto<E,D> {

    D toDto(E a);
}
