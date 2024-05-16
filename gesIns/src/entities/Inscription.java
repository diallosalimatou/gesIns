package JAVA.gesIns.src.entities;

import com.mycompany.gesIns.entities.Course;
import com.mycompany.gesIns.entities.Professor;
import com.mycompany.gesIns.services.CourseService;
import com.mycompany.gesIns.services.ProfessorService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Inscription {
    private ProfessorService professorService = new ProfessorService();
    private CourseService courseService = new CourseService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("1. Ajouter un Professeur");
            System.out.println("2. Lister les Professeurs");
            System.out.println("3. Créer un cours");
            System.out.println("4. Lister tous les cours");
            System.out.println("5. Lister les cours d’un professeur");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addProfessor();
                    break;
                case 2:
                    listProfessors();
                    break;
                case 3:
                    createCourse();
                    break;
                case 4:
                    listCourses();
                    break;
                case 5:
                    listCoursesByProfessor();
                    break;
                case 6:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private void addProfessor() {
        System.out.print("Entrez l'ID du professeur: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Entrez le nom du professeur: ");
        String name = scanner.nextLine();

        Professor professor = new Professor(id, name);
        professorService.addProfessor(professor);
        System.out.println("Professeur ajouté avec succès.");
    }

    private void listProfessors() {
        for (Professor professor : professorService.listProfessors()) {
            System.out.println(professor);
        }
    }

    private void createCourse() {
        System.out.print("Entrez l'ID du cours: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Entrez la date du cours (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.print("Entrez l'heure de début du cours (HH:MM): ");
        LocalTime heureDb = LocalTime.parse(scanner.nextLine());
        System.out.print("Entrez l'heure de fin du cours (HH:MM): ");
        LocalTime heureFin = LocalTime.parse(scanner.nextLine());
    }
}