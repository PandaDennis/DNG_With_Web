package com.lab.pandadenden.dngLab.model.dto;

import java.util.Date;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "fileDetailDtoBuilder")
public class FileDetailDto {
	
	private String fileName;
	private String fileType;
	
	private final Date createDateTime = new Date();
	
	
//	public static FileDetailDtoBuilder builder() {
//		return new FileDetailDtoBuilder();
//	}
//
//	public static FileDetailDtoBuilder builder(String fileName, String fileType, Date createDateTime) {
//		return builder().fileName(fileName).fileType(fileType).createDateTime(createDateTime);
//	}
	

}
