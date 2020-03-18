package service.impl;

import java.util.Optional;

import dao.FanClubDAO;
import dao.DAOFactory;
import domain.FanClub;
import exception.ValidationException;
import service.FanClubService;

public class FanClubServiceImpl implements FanClubService {

    private static final FanClubDAO dao = DAOFactory.getFanClubDAO();

    @Override
    public FanClub create(FanClub fanClub) {
        if (fanClub == null) {
            throw new ValidationException("Invalid fanClub");
        }

        String name = fanClub.getName();
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Plate is required");
        }

        if (name.length() < 3) {
            throw new ValidationException("Name is in wrong format");
        }

        return dao.create(fanClub);
    }

    @Override
    public Optional<FanClub> findByName(String name) {
        if (name == null || name.isEmpty()) {
            return Optional.empty();
        }

        return Optional.ofNullable(dao.findByName(name));
    }
}