package main.constructionCompany.tasks;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class Task1 {

    private static final Logger logger = LogManager.getLogger(Task1.class);

    public static void task() {
        try {
            Task1 stringTask = new Task1();
            File companyDescription = new File("src/main/resources/companyDescription.txt");
            String text = FileUtils.readFileToString(companyDescription, Charsets.toCharset(StandardCharsets.UTF_8));
            logger.info("Counted amount of words -  " + StringUtils.countMatches(text, "simplify"));
        } catch (Exception exception){
            logger.error(exception);
        }
    }
}
