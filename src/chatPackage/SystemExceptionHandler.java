package ChatExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SystemExceptionHandler {

    // System log file path
    private static final String SYSTEM_LOG_FILE = "system.log";

    public void handleException(Throwable exception) {
        try {
            // Log the exception to the system log file
            FileWriter writer = new FileWriter(SYSTEM_LOG_FILE, true);
            writer.write("System Exception: " + exception.getMessage() + "\n");
            writer.close();
        } catch (IOException e) {
            // Handle the file writing error
            e.printStackTrace();
        }
    }
}
