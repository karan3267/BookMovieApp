package upgrad.movieapp.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import upgrad.movieapp.api.model.ArtistRoleType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateArtistRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:12.635+05:30")

public class UpdateArtistRequest   {
  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("role_type")
  private ArtistRoleType roleType = null;

  @JsonProperty("profile_description")
  private String profileDescription = null;

  @JsonProperty("profile_url")
  private String profileUrl = null;

  @JsonProperty("wiki_url")
  private String wikiUrl = null;

  public UpdateArtistRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Updated first name of an artist
   * @return firstName
  **/
  @ApiModelProperty(value = "Updated first name of an artist")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateArtistRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Updated last name of an artist
   * @return lastName
  **/
  @ApiModelProperty(value = "Updated last name of an artist")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateArtistRequest roleType(ArtistRoleType roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Updated role of an artist
   * @return roleType
  **/
  @ApiModelProperty(value = "Updated role of an artist")

  @Valid

  public ArtistRoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(ArtistRoleType roleType) {
    this.roleType = roleType;
  }

  public UpdateArtistRequest profileDescription(String profileDescription) {
    this.profileDescription = profileDescription;
    return this;
  }

  /**
   * Updated profile description of an artist
   * @return profileDescription
  **/
  @ApiModelProperty(value = "Updated profile description of an artist")


  public String getProfileDescription() {
    return profileDescription;
  }

  public void setProfileDescription(String profileDescription) {
    this.profileDescription = profileDescription;
  }

  public UpdateArtistRequest profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

  /**
   * Updated profile URL of an artist
   * @return profileUrl
  **/
  @ApiModelProperty(value = "Updated profile URL of an artist")


  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }

  public UpdateArtistRequest wikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
    return this;
  }

  /**
   * Updated wikipedia URL of an artist
   * @return wikiUrl
  **/
  @ApiModelProperty(value = "Updated wikipedia URL of an artist")


  public String getWikiUrl() {
    return wikiUrl;
  }

  public void setWikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateArtistRequest updateArtistRequest = (UpdateArtistRequest) o;
    return Objects.equals(this.firstName, updateArtistRequest.firstName) &&
        Objects.equals(this.lastName, updateArtistRequest.lastName) &&
        Objects.equals(this.roleType, updateArtistRequest.roleType) &&
        Objects.equals(this.profileDescription, updateArtistRequest.profileDescription) &&
        Objects.equals(this.profileUrl, updateArtistRequest.profileUrl) &&
        Objects.equals(this.wikiUrl, updateArtistRequest.wikiUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, roleType, profileDescription, profileUrl, wikiUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateArtistRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    profileDescription: ").append(toIndentedString(profileDescription)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    wikiUrl: ").append(toIndentedString(wikiUrl)).append("\n");
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

