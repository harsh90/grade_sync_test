package com.example.demo;

public class SubmitScoreDTO {
    private String lappAssignmentId;
    private String piId;
    private double rawItemScore;
    private String submissionTime;

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(final String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public double getRawItemScore() {
        return rawItemScore;
    }

    public void setRawItemScore(final double rawItemScore) {
        this.rawItemScore = rawItemScore;
    }

    public String getPiId() {
        return piId;
    }

    public void setPiId(final String piId) {
        this.piId = piId;
    }

    public String getLappAssignmentId() {
        return lappAssignmentId;
    }

    public void setLappAssignmentId(final String lappAssignmentId) {
        this.lappAssignmentId = lappAssignmentId;
    }
}
