package com.cts.datalab.mytalentland.controller;

import com.cts.datalab.mytalentland.domain.TradeUser;
import com.cts.datalab.mytalentland.service.TradeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TradeUserController {

    private TradeUserService tradeUserService;

    @Autowired
    public TradeUserController(TradeUserService tradeUserService) {
        this.tradeUserService = tradeUserService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<TradeUser> getUserById(@PathVariable Long id) {
        Optional<TradeUser> tradeUser = tradeUserService.findById(id);

        if (tradeUser.isPresent()) {
            return ResponseEntity.ok(tradeUser.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/user")
    public ResponseEntity<List<TradeUser>> getAllUsers() {

        return ResponseEntity.ok(tradeUserService.findAll());
    }
}
