package com.exposit.kickerapp.model.impl;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.exposit.kickerapp.model.Game;
import com.exposit.kickerapp.model.Team;

@Entity
@Table(name = "game")
public class GameImpl extends BaseModelImpl implements Game
{
	private Collection<Team> teams;
	private String matchResult;

	public GameImpl()
	{
	}

	@ManyToOne(targetEntity = TeamImpl.class, cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "teams")
	public Collection<Team> getTeams()
	{
		return teams;
	}

	public void setTeams(Collection<Team> teams)
	{
		this.teams = teams;
	}

	@Override
	@Column(name = "match_result", nullable = false)
	public String getMatchResult()
	{
		return matchResult;
	}

	@Override
	public void setMatchResult(String matchResult)
	{
		this.matchResult = matchResult;
	}
}



		