package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

	private ActorMapper actorMapper;

	@Autowired
	public ActorService(ActorMapper actorMapper) {
		this.actorMapper = actorMapper;
	}

	public List<Actor> getActorList() {
		List<Actor> actorList = actorMapper.findAll();
		return actorList;
	}

}
