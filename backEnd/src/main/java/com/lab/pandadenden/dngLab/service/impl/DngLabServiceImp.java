package com.lab.pandadenden.dngLab.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.pandadenden.dngLab.service.DngService;
import com.lab.pandadenden.dngLab.util.DngLabFileUtil;

@Service
public class DngLabServiceImp implements DngService {

	private static final Logger logger = LoggerFactory.getLogger(DngLabServiceImp.class);
	
	@Autowired
	private DngLabFileUtil dngLabFileUtil;

	public String checkFileInfo(InputStream inputStream, String fileName) throws IOException {

		try {
			logger.debug(dngLabFileUtil.checkFileType(inputStream));
			return dngLabFileUtil.checkFileType(inputStream);
		} catch (IOException e) {
			logger.error(e.getMessage());
			return null;
		}

	};

}
