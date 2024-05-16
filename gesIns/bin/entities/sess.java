package JAVA.gesIns.bin.entities;


import java.time.LocalDate;
import java.time.LocalTime;

public class Sess {
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private String salle;

    
    public Sess(LocalDate date, LocalTime heureDb, LocalTime heureFin, String salle) {
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
        this.salle = salle;
    }

    
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getHeureDb() { return heureDb; }
    public void setHeureDb(LocalTime heureDb) { this.heureDb = heureDb; }

    public LocalTime getHeureFin() { return heureFin; }
    public void setHeureFin(LocalTime heureFin) { this.heureFin = heureFin; }

    public String getSalle() { return salle; }
    public void setSalle(String salle) { this.salle = salle; }

    @Override
    public String toString() {
        return "Session [date=" + date + ", heureDb=" + heureDb + ", heureFin=" + heureFin + ", salle=" + salle + "]";
    }
}


