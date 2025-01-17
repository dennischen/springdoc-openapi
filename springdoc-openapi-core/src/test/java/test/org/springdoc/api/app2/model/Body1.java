package test.org.springdoc.api.app2.model;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class Body1  {
  
  @Schema(description = "Additional data to pass to server")
 /**
   * Additional data to pass to server  
  **/
  private String additionalMetadata = null;
  
  @Schema(description = "file to upload")
 /**
   * file to upload  
  **/
  private File file = null;
 /**
   * Additional data to pass to server
   * @return additionalMetadata
  **/
  @JsonProperty("additionalMetadata")
  public String getAdditionalMetadata() {
    return additionalMetadata;
  }

  public void setAdditionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
  }

  public Body1 additionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
    return this;
  }

 /**
   * file to upload
   * @return file
  **/
  @JsonProperty("file")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public Body1 file(File file) {
    this.file = file;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    additionalMetadata: ").append(toIndentedString(additionalMetadata)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
