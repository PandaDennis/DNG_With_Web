package com.lab.pandadenden.dngLab.service.impl;

import java.util.Date;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lab.pandadenden.dngLab.model.dto.FileDetailDto;
import com.lab.pandadenden.dngLab.service.DngService;
import com.lab.pandadenden.dngLab.util.DngLabFileUtil;

@Service
public class DngLabServiceImp implements DngService {

	private static final Logger logger = LoggerFactory.getLogger(DngLabServiceImp.class);
	
	@Autowired
	private DngLabFileUtil dngLabFileUtil;

	public FileDetailDto getFileInfo(MultipartFile file) throws IOException {
		
		 
		try {		
			FileDetailDto fileDetailDto = new FileDetailDto();
			fileDetailDto.setFileType(dngLabFileUtil.checkFileType(file.getInputStream()));
			fileDetailDto.setFileName(file.getOriginalFilename());
			fileDetailDto.setCreateDateTime(new Date());
			logger.debug(fileDetailDto.toString());
			return fileDetailDto;
		} catch (IOException e) {
			logger.error(e.getMessage());
			return null;
		}

	}

	

}
