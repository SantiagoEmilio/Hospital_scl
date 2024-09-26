package Hospital.data;

import servicios.Doctor;
import java.util.ArrayList;

public class DataDoctor {

    private ArrayList<Doctor> data;

    // Constructor
    public DataDoctor() {
        data = new ArrayList<>();

        data.add(new Doctor("Dr. Juan Kook", "jjkkk.kook@bhospitaldd.com", "jkook123", "Cardiología"));
        data.add(new Doctor("Dra. Jinna Kikm", "jinna.kikm@bhospitaldd.com", "kikmpass", "Dermatología"));
        data.add(new Doctor("Dr. Ricardo Morales", "ricardo.morales@bhospitaldd.com", "rmorales789", "Pediatría"));
        data.add(new Doctor("Dra. Agustina Minn", "agustina.minn@bhospitaldd.com", "amin1234", "Traumatología"));
        data.add(new Doctor("Dr. Tauren Huyn", "tauren.huyn@bhospitaldd.com", "thuyn4321", "Neurología"));
    }

    public ArrayList<Doctor> getDataDoctor() {
        return data;
    }
}





