package org.spikeTassProject.contentmicroservice.controller;

import org.spikeTassProject.contentmicroservice.model.Content;
import org.spikeTassProject.contentmicroservice.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/contents")
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    @GetMapping("/")
    public List<Content> getAllContents() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Get all Contents...");
        System.out.println("------------------------------------------------------------------------");
        return contentRepository.findAll();
    }

    @PostMapping(value = "/create")
    public Content postContent(@RequestBody Content param) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Create a new Content... " + param.toString());
        System.out.println("------------------------------------------------------------------------");
        Content newContent = contentRepository.save(
                new Content(param.getUseremail(),param.getText()));
        return newContent;
    }
}
