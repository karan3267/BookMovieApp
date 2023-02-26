package upgrad.movieapp.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the task
 */
public enum ArtistRoleType {
  
  DIRECTOR("DIRECTOR"),
  
  PRODUCER("PRODUCER"),
  
  ACTOR("ACTOR"),
  
  CINEMATOGRAPHER("CINEMATOGRAPHER"),
  
  MUSICIAN("MUSICIAN"),
  
  STUNTMAN("STUNTMAN");

  private String value;

  ArtistRoleType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ArtistRoleType fromValue(String text) {
    for (ArtistRoleType b : ArtistRoleType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

