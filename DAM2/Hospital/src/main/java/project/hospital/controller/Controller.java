package project.hospital.controller;

import project.hospital.model.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {
    public static ArrayList consultaPersona(String nombre) {
        if (nombre.equals("pacient")) {
            ArrayList<Pacient> pacients = new ArrayList<>();
            pacients = PacientDAO.getHospitalPacients();
            return pacients;
        } else if (nombre.equals("metge")) {
            ArrayList<Metge> metges = new ArrayList<>();
            metges = MetgeDAO.getHospitalMetges();
        } else {
            ArrayList<Infermer> infermers = new ArrayList<>();
            infermers = InfermerDAO.getHospitalInfermers();
        }
        return null;
    }

    public static boolean deletePersona(String nombre, String nif) {
        boolean check = false;
        if (nombre.equals("pacient")) {
            //check=deletePacient(nif);
        } else if (nombre.equals("infermer")) {
            //check=deleteInfermer(nif);
        } else {
            //check=deleteInfermer(nif);
        }
        return true;

    }

    public static boolean addPacient(Pacient pacient) {
        boolean check = false;
        check = PacientDAO.addPacient(pacient);
        return check;
    }

    public static boolean addMetge(Metge metge) {
        boolean check = false;
        check = MetgeDAO.addMetge(metge);
        return check;

    }

    public static boolean addInfermer(Infermer infermer) {
        boolean check = false;
        check = InfermerDAO.addInfermer(infermer);
        return check;
    }

    public static ArrayList<Pacient> consultaOpera() {
        ArrayList<Pacient> pacients = new ArrayList<>();
        //pacients = PacientDAO.addPacient()
        return pacients;
    }

    //REVISAR!!!!!!
    public static String consultaEspecialitat() {
        String espAux;
        String consultaEsp = "";
        String name, cognom, especialitat;
        ArrayList<Metge> metges = new ArrayList<>();
        metges = MetgeDAO.getEspecialitatMetges();

        Iterator<Metge> it = metges.iterator();

        while (it.hasNext()) {
            Metge metge = new Metge();
            metge = it.next();
            name = metge.getNom();
            cognom = metge.getCognom();
            espAux = metge.getEspecialitat();
            //HACER QUE PASE TODOS LOS MÉDICOS DE UNA ESPECIALIDAD ANTES DE PASAR AL SIGUIENTE

            especialitat = metge.getEspecialitat();
            consultaEsp += name + " " + cognom + "\n";

        }
        return consultaEsp;
    }

    public static String getMetgeByEspecialitat() {
        String consultaEsp = "";
        String name, cognom, especialitat;
        ArrayList<Metge> metges = new ArrayList<>();
        metges = MetgeDAO.getEspecialitats();

        Iterator<Metge> it = metges.iterator();

        while (it.hasNext()) {
            Metge metge = new Metge();
            metge = it.next();
            cognom = metge.getCognom();
            name = metge.getNom();
            especialitat = metge.getEspecialitat();
            consultaEsp += name + " " + cognom + ": " + especialitat + "\n";

        }
        return consultaEsp;
    }

}


