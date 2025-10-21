/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gamerker.io.e.valua_java;
import com.gamerker.io.e.valua_java.controllersPack.AppController;
import com.gamerker.io.e.valua_java.controllersPack.DBController;
import com.gamerker.io.e.valua_java.mainClasses.User;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class EVALUA_JAVA {
    public static void main(String[] args) {
        AppController appManagerObj = new AppController();
        DBController dbManagerObj = new DBController();
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("=== ¡Iniciando sistema de juego! ===");

        User user1 = new User("student1", "student1@university.edu");
        User user2 = new User("student2", "student2@university.edu");

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n=== Math Logic Game ===");
            System.out.println("1. Ver pruebas disponibles");
            System.out.println("2. Ver historial de resultados");
            System.out.println("3. Exportar resultados a PDF");
            System.out.println("4. Gestionar usuarios");
            System.out.println("5. Gestionar pruebas");
            System.out.println("6. Salir");
            System.out.print("Elije una opcion: ");
            /*

            int choice = getInput.nextInt();
                getInput.nextLine(); // limpiar buffer

            switch (choice) {
                case 1 -> takeExam();
                case 2 -> viewResultsHistory();
                case 3 -> exportResultsToPDF();
                case 4 -> manageUsers();
                case 5 -> manageExams();
                case 6 -> {
                    System.out.println("¡Cerrando sistema!");
                    return;
                }
                default -> System.out.println("¡Opcion Invalida!");
            }
*/
        }
    }
}
