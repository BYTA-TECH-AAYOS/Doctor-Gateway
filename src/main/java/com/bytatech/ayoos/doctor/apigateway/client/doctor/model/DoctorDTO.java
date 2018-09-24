package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DoctorDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-23T16:09:16.109+05:30[Asia/Kolkata]")

public class DoctorDTO   {
  @JsonProperty("contactInfoId")
  private Long contactInfoId = null;

  @JsonProperty("doctorSettingsId")
  private Long doctorSettingsId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("locationId")
  private Long locationId = null;

  @JsonProperty("profileInfoId")
  private Long profileInfoId = null;

  @JsonProperty("specialisation")
  private String specialisation = null;

  @JsonProperty("workspaceId")
  private Long workspaceId = null;

  public DoctorDTO contactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
    return this;
  }

  /**
   * Get contactInfoId
   * @return contactInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getContactInfoId() {
    return contactInfoId;
  }

  public void setContactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
  }

  public DoctorDTO doctorSettingsId(Long doctorSettingsId) {
    this.doctorSettingsId = doctorSettingsId;
    return this;
  }

  /**
   * Get doctorSettingsId
   * @return doctorSettingsId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorSettingsId() {
    return doctorSettingsId;
  }

  public void setDoctorSettingsId(Long doctorSettingsId) {
    this.doctorSettingsId = doctorSettingsId;
  }

  public DoctorDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DoctorDTO locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public DoctorDTO profileInfoId(Long profileInfoId) {
    this.profileInfoId = profileInfoId;
    return this;
  }

  /**
   * Get profileInfoId
   * @return profileInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getProfileInfoId() {
    return profileInfoId;
  }

  public void setProfileInfoId(Long profileInfoId) {
    this.profileInfoId = profileInfoId;
  }

  public DoctorDTO specialisation(String specialisation) {
    this.specialisation = specialisation;
    return this;
  }

  /**
   * Get specialisation
   * @return specialisation
  **/
  @ApiModelProperty(value = "")


  public String getSpecialisation() {
    return specialisation;
  }

  public void setSpecialisation(String specialisation) {
    this.specialisation = specialisation;
  }

  public DoctorDTO workspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * Get workspaceId
   * @return workspaceId
  **/
  @ApiModelProperty(value = "")


  public Long getWorkspaceId() {
    return workspaceId;
  }

  public void setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoctorDTO doctorDTO = (DoctorDTO) o;
    return Objects.equals(this.contactInfoId, doctorDTO.contactInfoId) &&
        Objects.equals(this.doctorSettingsId, doctorDTO.doctorSettingsId) &&
        Objects.equals(this.id, doctorDTO.id) &&
        Objects.equals(this.locationId, doctorDTO.locationId) &&
        Objects.equals(this.profileInfoId, doctorDTO.profileInfoId) &&
        Objects.equals(this.specialisation, doctorDTO.specialisation) &&
        Objects.equals(this.workspaceId, doctorDTO.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfoId, doctorSettingsId, id, locationId, profileInfoId, specialisation, workspaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoctorDTO {\n");
    
    sb.append("    contactInfoId: ").append(toIndentedString(contactInfoId)).append("\n");
    sb.append("    doctorSettingsId: ").append(toIndentedString(doctorSettingsId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    profileInfoId: ").append(toIndentedString(profileInfoId)).append("\n");
    sb.append("    specialisation: ").append(toIndentedString(specialisation)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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

