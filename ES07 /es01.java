import java.io.*;

public class es01 {
    public static void main(String[] args) {
     
        int cateto1 = 3; 
        int cateto2 = 4; 

        double area = (cateto1 * cateto2) / 2.0;
        System.out.println("Area del triangolo: " + area);

        
        try {
            
            String command = "java TriangoloFiglio " + cateto1 + " " + cateto2;
            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);  
                }
            }

            int exitCode = process.waitFor();
            System.out.println("Processo figlio terminato con codice: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

