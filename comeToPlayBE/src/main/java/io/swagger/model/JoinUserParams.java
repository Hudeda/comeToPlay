package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

public class JoinUserParams {

    @JsonProperty("eventId")
    private String eventId;

    @JsonProperty("creater")
    private User user;
}
