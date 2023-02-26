package upgrad.movieapp.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the movie
 */
public enum MovieStatusType {
  
  PUBLISHED("PUBLISHED"),
  
  RELEASED("RELEASED"),
  
  DELETED("DELETED");

  private String value;

  MovieStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MovieStatusType fromValue(String text) {
    for (MovieStatusType b : MovieStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

