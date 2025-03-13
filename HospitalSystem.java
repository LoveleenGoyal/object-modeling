import java.util.ArrayList;

// Hospital class demonstrating Association with Doctors and Patients
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display hospital details
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayDoctorDetails();
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            patient.displayPatientDetails();
        }
    }
}

// Doctor class demonstrating Association with Patients
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method to add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method for consultation
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    // Method to display doctor details
    public void displayDoctorDetails() {
        System.out.println("Doctor: " + name);
    }
}

// Patient class demonstrating Association with Doctors
class Patient {
    private String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient: " + name);
    }
}

// Main class to demonstrate association and communication
public class HospitalSystem {
    public static void main(String[] args) {
        // Creating a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Creating doctors
        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        // Creating patients
        Patient patientA = new Patient("Alice");
        Patient patientB = new Patient("Bob");

        // Associating doctors and patients
        drSmith.addPatient(patientA);
        drJones.addPatient(patientB);

        // Adding doctors and patients to hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(patientA);
        hospital.addPatient(patientB);

        // Display hospital details
        hospital.displayHospitalDetails();

        // Demonstrating consultations
        drSmith.consult(patientA);
        drJones.consult(patientB);
    }
}
