package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

public class Message   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("creater")
  private User creater = null;

  public Message id(String id) {
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

  public Message message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Message creater(User creater) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.message, message.message) &&
        Objects.equals(this.creater, message.creater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, creater);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    creater: ").append(toIndentedString(creater)).append("\n");
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

