package com.arun.controller;

import com.arun.pojo.PlayerPersonalInfo;
import com.arun.pojo.SimpleMessageResponse;
import com.arun.service.ClubStatsService;
import com.arun.service.PlayerStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * Created by arun on 11/02/19.
 */
@RestController
@RequestMapping("club")
public class ClubStatsController {


    @Autowired
    ClubStatsService clubStatsService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getClubPlayersInfo(@RequestParam("name") String clubName) {

        Set<PlayerPersonalInfo> playerPersonalInfoSet = clubStatsService.getClubPlayerInfo(clubName);

        if (playerPersonalInfoSet != null)
            return new ResponseEntity<>(playerPersonalInfoSet, HttpStatus.OK);
        else
            return new ResponseEntity<>(new SimpleMessageResponse("Club doesn't have any players associated with it"), HttpStatus.NOT_FOUND);
    }
}
