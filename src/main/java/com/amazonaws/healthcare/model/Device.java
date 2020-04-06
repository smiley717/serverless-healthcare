/**
 * 
 */
package com.amazonaws.healthcare.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.amazonaws.healthcare.util.SensorType;

import lombok.Data;

/**
 * @author yashvant
 *
 */
@Data
public class Device {
	//UUID 
	String id;
	@NotNull
	SensorType type;	
	//@NotEmpty
	//String patientId;
	@NotEmpty
	String deviceName;
	@NotEmpty
	String ipAddress;
	@NotNull
	Integer port;
	@NotEmpty
	String protocal;

}
