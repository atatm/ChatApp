package ChatExceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CustomExceptionHandler {

    // Custom log file path
    private static final String CUSTOM_LOG_FILE = "custom.log";

    public void handleCustomException(Throwable exception) {
        try {
            // Log the custom exception to a custom log file
            FileWriter writer = new FileWriter(CUSTOM_LOG_FILE, true);
            writer.write("Custom Exception: " + exception.getMessage() + "\n");
            writer.close();
        } catch (IOException e) {
            // Handle the file writing error
            e.printStackTrace();
        }
    }
}
