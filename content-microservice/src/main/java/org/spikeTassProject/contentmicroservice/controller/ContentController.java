package org.spikeTassProject.contentmicroservice.controller;

import org.spikeTassProject.contentmicroservice.model.Content;
import org.spikeTassProject.contentmicroservice.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// @TODO A cosa serve?
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
@RestController
@RequestMapping("/api/contents")
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    @GetMapping("/")
    public List<Content> getAllContents() {
        System.out.println("Get all Users...");
        return contentRepository.findAll();
    }

    @PostMapping(value = "/create")
    public Content postContent(@RequestBody Content parametro) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(parametro.toString());
        System.out.println("------------------------------------------------------------------------");
        Content newContent = contentRepository.save(
                new Content(parametro.getUseremail(),parametro.getText()));
        return newContent;
    }
}
