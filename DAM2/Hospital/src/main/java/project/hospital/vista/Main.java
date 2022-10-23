package project.hospital.vista;

import project.hospital.model.Metge;
import project.hospital.model.MetgeDAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Metge metge = new Metge();
        ArrayList<Metge> metges = new ArrayList<>();

        metges = MetgeDAO.getHospitalMetges();
    }
}
