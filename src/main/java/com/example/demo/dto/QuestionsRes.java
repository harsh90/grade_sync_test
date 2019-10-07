package com.example.demo.dto;
import java.util.List;

public class QuestionsRes {
    private String question;
    private String published_at;
    private List<Choices> choices;

    public List<Choices> getChoices() {
        return choices;
    }

    public void setChoices(final List<Choices> choices) {
        this.choices = choices;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(final String published_at) {
        this.published_at = published_at;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(final String question) {
        this.question = question;
    }
}
