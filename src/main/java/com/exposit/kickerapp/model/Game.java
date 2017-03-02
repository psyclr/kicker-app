package com.exposit.kickerapp.model;

import java.util.Collection;

public interface Game
{
	public Collection<Team> getTeams();

	void setTeams(Collection<Team> teams);

	String getMatchResult();

	void setMatchResult(String matchResult);
}
