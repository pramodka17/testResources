package com.revefi;

import java.io.File;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("snowflake.yaml");
        File file = new File(resource.getFile());
        System.out.println(file.length());
    }
}

