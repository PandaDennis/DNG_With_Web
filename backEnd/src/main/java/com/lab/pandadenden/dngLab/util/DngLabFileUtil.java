package com.lab.pandadenden.dngLab.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.Tika;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.springframework.stereotype.Component;

import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.lab.pandadenden.dngLab.model.dto.FileDetailDto;

@Component
public class DngLabFileUtil {

	private final Tika tika = new Tika();

	public String checkFileType(InputStream inputStream) throws IOException {

		FileDetailDto fileDetail = new FileDetailDto();
		try {
			Tika tika = new Tika();
			Metadata metadata = new Metadata();
			return tika.detect(inputStream, metadata);
		} catch (IOException e) {
			return null;
		}
	}

}
