package com.cts.datalab.mytalentland.repository;

import com.cts.datalab.mytalentland.domain.TradeUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TradeUserRepository extends MongoRepository<TradeUser, Long> {

    Optional<TradeUser> findById(Long id);


}
