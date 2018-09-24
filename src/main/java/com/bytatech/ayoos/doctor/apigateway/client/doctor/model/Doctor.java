package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ContactInfo;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorSessionInfo;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorSettings;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.Location;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ProfileInfo;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ReservedSlot;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.Workspace;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Doctor
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-23T16:09:16.109+05:30[Asia/Kolkata]")

public class Doctor   {
  @JsonProperty("contactInfo")
  private ContactInfo contactInfo = null;

  @JsonProperty("doctorSessionInfos")
  @Valid
  private List<DoctorSessionInfo> doctorSessionInfos = null;

  @JsonProperty("doctorSettings")
  private DoctorSettings doctorSettings = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("profileInfo")
  private ProfileInfo profileInfo = null;

  @JsonProperty("reservedSlots")
  @Valid
  private List<ReservedSlot> reservedSlots = null;

  @JsonProperty("specialisation")
  private String specialisation = null;

  @JsonProperty("workspace")
  private Workspace workspace = null;

  public Doctor contactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  /**
   * Get contactInfo
   * @return contactInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Doctor doctorSessionInfos(List<DoctorSessionInfo> doctorSessionInfos) {
    this.doctorSessionInfos = doctorSessionInfos;
    return this;
  }

  public Doctor addDoctorSessionInfosItem(DoctorSessionInfo doctorSessionInfosItem) {
    if (this.doctorSessionInfos == null) {
      this.doctorSessionInfos = new ArrayList<DoctorSessionInfo>();
    }
    this.doctorSessionInfos.add(doctorSessionInfosItem);
    return this;
  }

  /**
   * A relationship
   * @return doctorSessionInfos
  **/
  @ApiModelProperty(value = "A relationship")

  @Valid

  public List<DoctorSessionInfo> getDoctorSessionInfos() {
    return doctorSessionInfos;
  }

  public void setDoctorSessionInfos(List<DoctorSessionInfo> doctorSessionInfos) {
    this.doctorSessionInfos = doctorSessionInfos;
  }

  public Doctor doctorSettings(DoctorSettings doctorSettings) {
    this.doctorSettings = doctorSettings;
    return this;
  }

  /**
   * Get doctorSettings
   * @return doctorSettings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DoctorSettings getDoctorSettings() {
    return doctorSettings;
  }

  public void setDoctorSettings(DoctorSettings doctorSettings) {
    this.doctorSettings = doctorSettings;
  }

  public Doctor id(Long id) {
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

  public Doctor location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Doctor profileInfo(ProfileInfo profileInfo) {
    this.profileInfo = profileInfo;
    return this;
  }

  /**
   * Get profileInfo
   * @return profileInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProfileInfo getProfileInfo() {
    return profileInfo;
  }

  public void setProfileInfo(ProfileInfo profileInfo) {
    this.profileInfo = profileInfo;
  }

  public Doctor reservedSlots(List<ReservedSlot> reservedSlots) {
    this.reservedSlots = reservedSlots;
    return this;
  }

  public Doctor addReservedSlotsItem(ReservedSlot reservedSlotsItem) {
    if (this.reservedSlots == null) {
      this.reservedSlots = new ArrayList<ReservedSlot>();
    }
    this.reservedSlots.add(reservedSlotsItem);
    return this;
  }

  /**
   * Get reservedSlots
   * @return reservedSlots
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ReservedSlot> getReservedSlots() {
    return reservedSlots;
  }

  public void setReservedSlots(List<ReservedSlot> reservedSlots) {
    this.reservedSlots = reservedSlots;
  }

  public Doctor specialisation(String specialisation) {
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

  public Doctor workspace(Workspace workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Workspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(Workspace workspace) {
    this.workspace = workspace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doctor doctor = (Doctor) o;
    return Objects.equals(this.contactInfo, doctor.contactInfo) &&
        Objects.equals(this.doctorSessionInfos, doctor.doctorSessionInfos) &&
        Objects.equals(this.doctorSettings, doctor.doctorSettings) &&
        Objects.equals(this.id, doctor.id) &&
        Objects.equals(this.location, doctor.location) &&
        Objects.equals(this.profileInfo, doctor.profileInfo) &&
        Objects.equals(this.reservedSlots, doctor.reservedSlots) &&
        Objects.equals(this.specialisation, doctor.specialisation) &&
        Objects.equals(this.workspace, doctor.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfo, doctorSessionInfos, doctorSettings, id, location, profileInfo, reservedSlots, specialisation, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doctor {\n");
    
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    doctorSessionInfos: ").append(toIndentedString(doctorSessionInfos)).append("\n");
    sb.append("    doctorSettings: ").append(toIndentedString(doctorSettings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    profileInfo: ").append(toIndentedString(profileInfo)).append("\n");
    sb.append("    reservedSlots: ").append(toIndentedString(reservedSlots)).append("\n");
    sb.append("    specialisation: ").append(toIndentedString(specialisation)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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

