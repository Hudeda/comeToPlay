package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import javax.validation.Valid;

/**
 * Event
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

public class Event   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("place")
  private String place = null;

  @JsonProperty("participants")
  private List<User> participants = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("creater")
  private User creater = null;

  @JsonProperty("dateCreated")
  private DateTime dateCreated = null;

  @JsonProperty("eventDate")
  private DateTime eventDate = null;

  public Event id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Event place(String place) {
    this.place = place;
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public Event participants(List<User> participants) {
    this.participants = participants;
    return this;
  }

  public Event addParticipantsItem(User participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<User>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<User> getParticipants() {
    return participants;
  }

  public void setParticipants(List<User> participants) {
    this.participants = participants;
  }

  public Event details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Event creater(User creater) {
    this.creater = creater;
    return this;
  }

   /**
   * Get creater
   * @return creater
  **/
  @ApiModelProperty(value = "")

  @Valid

  public User getCreater() {
    return creater;
  }

  public void setCreater(User creater) {
    this.creater = creater;
  }

  public Event dateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(DateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Event eventDate(DateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(DateTime eventDate) {
    this.eventDate = eventDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.place, event.place) &&
        Objects.equals(this.participants, event.participants) &&
        Objects.equals(this.details, event.details) &&
        Objects.equals(this.creater, event.creater) &&
        Objects.equals(this.dateCreated, event.dateCreated) &&
        Objects.equals(this.eventDate, event.eventDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, place, participants, details, creater, dateCreated, eventDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    creater: ").append(toIndentedString(creater)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

