package com.lab.pandadenden.dngLab.model.dto;

import java.util.Date;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class FileDetailDto {
	private String fileName;
	private String fileType;
	private Date createDateTime;

}
