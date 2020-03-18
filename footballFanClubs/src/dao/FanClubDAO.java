package dao;

import domain.FanClub;

public interface FanClubDAO extends GenericDAO<FanClub> {

    FanClub findByName(String name);
}