package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.Valid;

/**
 * Games
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-05T13:20:02.674Z")

public class Games   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("vsTeam")
  private String vsTeam = null;

  @JsonProperty("gameTime")
  private DateTime gameTime = null;

  @JsonProperty("homeGame")
  private Boolean homeGame = null;

  @JsonProperty("creater")
  private User creater = null;

  public Games id(String id) {
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

  public Games vsTeam(String vsTeam) {
    this.vsTeam = vsTeam;
    return this;
  }

   /**
   * Get vsTeam
   * @return vsTeam
  **/
  @ApiModelProperty(value = "")


  public String getVsTeam() {
    return vsTeam;
  }

  public void setVsTeam(String vsTeam) {
    this.vsTeam = vsTeam;
  }

  public Games gameTime(DateTime gameTime) {
    this.gameTime = gameTime;
    return this;
  }

   /**
   * Get gameTime
   * @return gameTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getGameTime() {
    return gameTime;
  }

  public void setGameTime(DateTime gameTime) {
    this.gameTime = gameTime;
  }

  public Games homeGame(Boolean homeGame) {
    this.homeGame = homeGame;
    return this;
  }

   /**
   * Get homeGame
   * @return homeGame
  **/
  @ApiModelProperty(value = "")


  public Boolean getHomeGame() {
    return homeGame;
  }

  public void setHomeGame(Boolean homeGame) {
    this.homeGame = homeGame;
  }

  public Games creater(User creater) {
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
    Games games = (Games) o;
    return Objects.equals(this.id, games.id) &&
        Objects.equals(this.vsTeam, games.vsTeam) &&
        Objects.equals(this.gameTime, games.gameTime) &&
        Objects.equals(this.homeGame, games.homeGame) &&
        Objects.equals(this.creater, games.creater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vsTeam, gameTime, homeGame, creater);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Games {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vsTeam: ").append(toIndentedString(vsTeam)).append("\n");
    sb.append("    gameTime: ").append(toIndentedString(gameTime)).append("\n");
    sb.append("    homeGame: ").append(toIndentedString(homeGame)).append("\n");
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

