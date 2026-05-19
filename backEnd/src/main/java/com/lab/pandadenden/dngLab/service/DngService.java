package com.lab.pandadenden.dngLab.service;

import java.io.IOException;
import java.io.InputStream;

public interface DngService {
	
	
	public String checkFileInfo(InputStream inputStream, String fileName) throws IOException;
}
