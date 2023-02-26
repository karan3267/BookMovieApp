package upgrad.movieapp.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Language of the movie to be mapped to this show
 */
public enum LanguageType {
  
  ENGLISH("ENGLISH"),
  
  HINDI("HINDI"),
  
  KANNADA("KANNADA"),
  
  MARATHI("MARATHI"),
  
  TELUGU("TELUGU"),
  
  TAMIL("TAMIL"),
  
  MALAYALAM("MALAYALAM"),
  
  BENGALI("BENGALI"),
  
  PUNJABI("PUNJABI");

  private String value;

  LanguageType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LanguageType fromValue(String text) {
    for (LanguageType b : LanguageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

