package com.apress.quickpoll.apress.controller;

import com.apress.quickpoll.apress.exception.ResourceNotFoundException;
import com.apress.quickpoll.apress.model.Poll;
import com.apress.quickpoll.apress.repository.PollRepository;
import com.apress.quickpoll.apress.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;


@RestController
public class PollController {


    @Autowired
    private PollService pollService;


    @GetMapping("/polls")
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        return  pollService.getAllPolls();
    }

    @GetMapping("/polls/{pollId}")
    public ResponseEntity<?> getPoll(@PathVariable Long pollId) {
        return pollService.getPoll(pollId);
    }

    @PostMapping(value="/polls")
    public ResponseEntity<?> createPoll(@Valid @RequestBody Poll poll) {
        return pollService.createPoll(poll);
    }

    @PutMapping("/polls/{pollId}")
    public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
        return pollService.updatePoll(poll,pollId);
    }

    @DeleteMapping("/polls/{pollId}")
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
        return pollService.deletePoll(pollId);
    }

}
