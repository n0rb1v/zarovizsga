package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WorkHours {
    public String minWork(String s) {
        try (BufferedReader bf = Files.newBufferedReader(Path.of(s))) {
            String line;
            List<Worker> wl = new ArrayList<>();

            while ((line = bf.readLine()) != null) {
                String[] temp = line.split(",");
                Worker w = new Worker(temp[0], Integer.parseInt(temp[1]), LocalDate.parse(temp[2]));
                wl.add(w);
            }
            wl.sort(Comparator.comparing(Worker::getWork));
            return wl.get(0).getName() + ": " + wl.get(0).getDate();
        } catch (IOException e) {
            throw new IllegalStateException("file hiba", e);
        }
    }
}
