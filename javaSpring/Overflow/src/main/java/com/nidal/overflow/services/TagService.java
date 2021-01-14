package com.nidal.overflow.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.nidal.overflow.models.Tag;
import com.nidal.overflow.repositories.TagRepository;

@Service
public class TagService {
	private final TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public ArrayList<Tag> findAll() {
		return (ArrayList<Tag>) tagRepository.findAll();
	}

	public Tag createTag(String tag) {
		return tagRepository.save(new Tag(tag));
		
	}
}