package utils;

import java.io.File;

public class FilePaths
{
    public static String propertiesFilePath =  new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static String screenShotsPath = new File("src/main/resources/screenShorts").getAbsolutePath();

}
