package com.nidal.overflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nidal.overflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long> {

}