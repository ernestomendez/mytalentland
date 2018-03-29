package com.cts.datalab.mytalentland.service;

import com.cts.datalab.mytalentland.domain.TradeUser;
import com.cts.datalab.mytalentland.repository.TradeUserRepository;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeUserService {


    private TradeUserRepository tradeUserRepository;

    @Autowired
    public TradeUserService(TradeUserRepository tradeUserRepository) {
        this.tradeUserRepository = tradeUserRepository;
    }

    /**
     * Finds a TradeUser by Id.
     *
     * @param id TradeUser identifier.
     * @return the TradeUser found.
     */
    public Optional<TradeUser> findById(Long id) {
        Validate.notNull(id, "Id can not be null");

        return tradeUserRepository.findById(id);
    }

    /**
     * Saves or creates a TradeUser.
     *
     * @param tradeUser tradeUser to save.
     */
    public TradeUser save(TradeUser tradeUser) {
        Validate.notNull(tradeUser, "TradeUser can not be null");
        TradeUser user = null;

        if (tradeUser.getId() == null) {
            user = tradeUserRepository.insert(tradeUser);
        } else {
            user = tradeUserRepository.save(tradeUser);
        }

        return user;
    }

    /**
     * Find all users.
     *
     * @return all users list.
     */
    public List<TradeUser> findAll() {
        return tradeUserRepository.findAll();
    }
}
