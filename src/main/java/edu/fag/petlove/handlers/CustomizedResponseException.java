package edu.fag.petlove.handlers;

import java.io.Serializable;
import java.util.Date;

public class CustomizedResponseException implements Serializable {
    private final Date timestamp;
    private final String message;
    private final String details;

    public CustomizedResponseException(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
