package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservedSlotDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-23T16:09:16.109+05:30[Asia/Kolkata]")

public class ReservedSlotDTO   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("doctorId")
  private Long doctorId = null;

  @JsonProperty("endTime")
  private ZonedDateTime endTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("slotStatusId")
  private Long slotStatusId = null;

  @JsonProperty("startTime")
  private ZonedDateTime startTime = null;

  public ReservedSlotDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ReservedSlotDTO doctorId(Long doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(Long doctorId) {
    this.doctorId = doctorId;
  }

  public ReservedSlotDTO endTime(ZonedDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(ZonedDateTime endTime) {
    this.endTime = endTime;
  }

  public ReservedSlotDTO id(Long id) {
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

  public ReservedSlotDTO slotStatusId(Long slotStatusId) {
    this.slotStatusId = slotStatusId;
    return this;
  }

  /**
   * Get slotStatusId
   * @return slotStatusId
  **/
  @ApiModelProperty(value = "")


  public Long getSlotStatusId() {
    return slotStatusId;
  }

  public void setSlotStatusId(Long slotStatusId) {
    this.slotStatusId = slotStatusId;
  }

  public ReservedSlotDTO startTime(ZonedDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ZonedDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(ZonedDateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservedSlotDTO reservedSlotDTO = (ReservedSlotDTO) o;
    return Objects.equals(this.date, reservedSlotDTO.date) &&
        Objects.equals(this.doctorId, reservedSlotDTO.doctorId) &&
        Objects.equals(this.endTime, reservedSlotDTO.endTime) &&
        Objects.equals(this.id, reservedSlotDTO.id) &&
        Objects.equals(this.slotStatusId, reservedSlotDTO.slotStatusId) &&
        Objects.equals(this.startTime, reservedSlotDTO.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, doctorId, endTime, id, slotStatusId, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservedSlotDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slotStatusId: ").append(toIndentedString(slotStatusId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

