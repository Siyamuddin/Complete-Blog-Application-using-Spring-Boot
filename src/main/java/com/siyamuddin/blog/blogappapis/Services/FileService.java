package com.siyamuddin.blog.blogappapis.Services;

import org.springframework.web.multipart.MultipartFile;

import javax.print.attribute.standard.MultipleDocumentHandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {
    String uploadImage(String path, MultipartFile file) throws IOException;
    InputStream getSource(String path, String fileName) throws FileNotFoundException;
}
