package com.exposit.kickerapp.repository;

import org.springframework.stereotype.Repository;

import com.exposit.kickerapp.model.User;
import com.exposit.kickerapp.model.impl.UserImpl;

@Repository
public interface UserRepository extends BaseRepository<UserImpl, Long>
{

	User findByUserName(String userName);

}