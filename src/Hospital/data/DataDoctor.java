package Hospital.data;
import servicios.BaseDeDatosDoc;
import servicios.Doctor;

import java.util.ArrayList;

public class DataDoctor {
    ArrayList<Doctor> data = new ArrayList<>();

    public DataDoctor() {

        data.add(new Doctor("Dr. Juan Kook", "jjkkk.kook@bhospitaldd.com", "Cardiología", "jkkkook", "bag23"));
        data.add(new Doctor("Dra. Jinna Kikm", "jinna.kikm@bhospitaldd.com", "Dermatología", "jinnakm", "tan43"));
        data.add(new Doctor("Dr. Ricardo Morales", "ricardo.morales@bhospitaldd.com", "Pediatría", "ricardMo", "bamm56"));
        data.add(new Doctor("Dra. Agustina Minn", "agustina.minn@bhospitaldd.com", "Traumatología", "agustM", "portyyea43"));
        data.add(new Doctor("Dr. Tauren huyn", "tauren.huyn@bhospitaldd.com", "Neurología", "taurenh", "niagarapo"));

    }

    public ArrayList<Doctor> getDataDoctor() {
         return data;
    }
}




