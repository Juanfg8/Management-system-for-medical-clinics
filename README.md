Medical Clinic Management System

This is a medical clinic management system developed in Java, which helps in organizing appointments, patients and doctors. It was designed to make the day-to-day running of clinics more efficient, ensuring centralized control of essential information.

Main features

Patient registration - Store essential information about each patient, including medical history
Appointment scheduling - Allows you to schedule, modify and cancel appointments easily
Doctor and specialty management - Assign professionals to specialties and monitor their appointments
Medical records - Record diagnoses, prescriptions and clinical progress of patients
Detailed reports - Generate reports on appointments, billing and clinic performance
Financial control - Monitor payments, invoices and cash flow of the clinic

Technologies used

Java (JDK 17+) for the main logic
Swing for intuitive graphical interface
SQL database for secure storage of information
Git for version control
JUnit for automated testing

How to install and run

Clone the repository
git clone <REPOSITORY_URL>
cd SistemaClinica

Compile the project
javac -d bin src/*.java

Create the JAR to run
jar cvfm ClinicaSystem.jar MANIFEST.MF -C bin .

Run the system
java -jar ClinicaSystem.jar

How to contribute

Contributions are welcome. If you want to add new features or fix bugs

Fork the repository
Create a new branch for your changes
git checkout -b my-improvement

Make the changes and commit
git add .
git commit -m "Improvement adding new feature"

Submit your code for review
git push origin my-improvement

Open a pull request on GitHub
