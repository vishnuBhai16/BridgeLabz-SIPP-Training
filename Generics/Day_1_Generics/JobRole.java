package Day_1_Generics;

import java.util.List;

abstract class JobRole {
    String candidateName;
    public JobRole(String name) {
        this.candidateName = name;
    }
    abstract void analyzeResume();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) { super(name); }
    void analyzeResume() { System.out.println("Analyzing resume for SE: " + candidateName); }
}

class DataScientist extends JobRole {
    public DataScientist(String name) { super(name); }
    void analyzeResume() { System.out.println("Analyzing resume for DS: " + candidateName); }
}

class ProductManager extends JobRole {
    public ProductManager(String name) { super(name); }
    void analyzeResume() { System.out.println("Analyzing resume for PM: " + candidateName); }
}

class Resume<T extends JobRole> {
    T role;
    public Resume(T role) {
        this.role = role;
    }

    public void process() {
        role.analyzeResume();
    }

    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            r.analyzeResume();
        }
    }
}
