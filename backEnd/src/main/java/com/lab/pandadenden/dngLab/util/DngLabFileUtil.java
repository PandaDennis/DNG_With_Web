package com.lab.pandadenden.dngLab.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.Tika;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.springframework.stereotype.Component;

@Component
public class DngLabFileUtil {

	private final Tika tika = new Tika();

	public String checkFileType(InputStream inputStream) throws IOException {

		try {
			return tika.detect(TikaInputStream.get(inputStream)
					, new Metadata());
		} catch (IOException e) {
			return null;
		}
	}

}
