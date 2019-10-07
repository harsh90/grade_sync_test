package com.example.demo;

import com.example.demo.dto.Choices;
import com.example.demo.dto.QuestionsRes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MockController {

    @GetMapping(value = "/questions" )
    public QuestionsRes publishActivity(
    ) {
        QuestionsRes questionsRes=new QuestionsRes();
        questionsRes.setQuestion("Favourite programming language?");
        questionsRes.setPublished_at("2015-08-05T08:40:51.620Z");

        Choices c1=new Choices();
        c1.setChoice("Swift");
        c1.setVotes("2048");

        Choices c2=new Choices();
        c2.setChoice("Python");
        c2.setVotes("1024");

        Choices c3=new Choices();
        c3.setChoice("c3");
        c3.setVotes("v3");

        questionsRes.setChoices(Arrays.asList(c1,c2,c3));
        return questionsRes;
    }
}
