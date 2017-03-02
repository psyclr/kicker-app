package com.exposit.kickerapp.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exposit.kickerapp.model.impl.BaseModelImpl;

@Repository
public interface BaseRepository<T extends BaseModelImpl, IdType extends Serializable> extends
		CrudRepository<T, IdType> {

}