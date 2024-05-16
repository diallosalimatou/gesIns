package JAVA.gesIns.src.entities;



import java.time.LocalDate;
import java.time.LocalTime;

public class Course {
    private int id;
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private Professor professor;

    // Constructors
    public Course(int id, LocalDate date, LocalTime heureDb, LocalTime heureFin, Professor professor) {
        this.id = id;
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
        this.professor = professor;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getHeureDb() { return heureDb; }
    public void setHeureDb(LocalTime heureDb) { this.heureDb = heureDb; }

    public LocalTime getHeureFin() { return heureFin; }
    public void setHeureFin(LocalTime heureFin) { this.heureFin = heureFin; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    @Override
    public String toString() {
        return "Course [id=" + id + ", date=" + date + ", heureDb=" + heureDb + ", heureFin=" + heureFin + ", professor=" + professor + "]";
    }
}
