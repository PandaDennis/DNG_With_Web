package com.lab.pandadenden.dngLab.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.lab.pandadenden.dngLab.model.dto.FileDetailDto;

public interface DngService {
	
	
	public FileDetailDto getFileInfo(MultipartFile file) throws IOException;
}
