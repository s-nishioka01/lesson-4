package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActorMapper {

	List<Actor> findAll();

}
