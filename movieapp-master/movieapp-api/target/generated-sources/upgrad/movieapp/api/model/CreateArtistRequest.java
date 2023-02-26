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
 * CreateArtistRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-02-26T22:53:12.635+05:30")

public class CreateArtistRequest   {
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

  public CreateArtistRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of an artist
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "First name of an artist")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateArtistRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of an artist
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Last name of an artist")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateArtistRequest roleType(ArtistRoleType roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Role of an artist
   * @return roleType
  **/
  @ApiModelProperty(required = true, value = "Role of an artist")
  @NotNull

  @Valid

  public ArtistRoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(ArtistRoleType roleType) {
    this.roleType = roleType;
  }

  public CreateArtistRequest profileDescription(String profileDescription) {
    this.profileDescription = profileDescription;
    return this;
  }

  /**
   * Profile description of an artist
   * @return profileDescription
  **/
  @ApiModelProperty(value = "Profile description of an artist")


  public String getProfileDescription() {
    return profileDescription;
  }

  public void setProfileDescription(String profileDescription) {
    this.profileDescription = profileDescription;
  }

  public CreateArtistRequest profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

  /**
   * Profile URL of an artist
   * @return profileUrl
  **/
  @ApiModelProperty(required = true, value = "Profile URL of an artist")
  @NotNull


  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }

  public CreateArtistRequest wikiUrl(String wikiUrl) {
    this.wikiUrl = wikiUrl;
    return this;
  }

  /**
   * Wikipedia URL of an artist
   * @return wikiUrl
  **/
  @ApiModelProperty(value = "Wikipedia URL of an artist")


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
    CreateArtistRequest createArtistRequest = (CreateArtistRequest) o;
    return Objects.equals(this.firstName, createArtistRequest.firstName) &&
        Objects.equals(this.lastName, createArtistRequest.lastName) &&
        Objects.equals(this.roleType, createArtistRequest.roleType) &&
        Objects.equals(this.profileDescription, createArtistRequest.profileDescription) &&
        Objects.equals(this.profileUrl, createArtistRequest.profileUrl) &&
        Objects.equals(this.wikiUrl, createArtistRequest.wikiUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, roleType, profileDescription, profileUrl, wikiUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateArtistRequest {\n");
    
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

