package service;

import java.util.Optional;

import domain.FanClub;

public interface FanClubService {

    FanClub create(FanClub fanClub);

    Optional<FanClub> findByName(String name);
}