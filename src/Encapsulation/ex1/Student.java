package Encapsulation.ex1;

public class Student {
    private String Name;
    private int id;
    private float cgpa;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            Name = name;
        }
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        if(cgpa >0.0 && cgpa <= 10.00){
            this.cgpa = cgpa;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", cgpa=" + cgpa +
                '}';
    }
}
