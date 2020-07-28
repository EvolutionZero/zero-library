package com.zero.commons.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.apache.commons.io.Charsets.UTF_8;

public class DemoFileUtils {

    public static void main(String[] args) throws IOException {
        File file = new File(DemoFileUtils.class.getClassLoader().getResource("file.txt").getFile());
        long crc32 = FileUtils.checksumCRC32(file);
        System.out.println(crc32);
    }

}
