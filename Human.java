public class Human {
   private int yearOfBirth ;
    String name;
   private String town;
    String jobTitle;

    public Human( int yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        this.name = name;
        if (name== null) {
            this.name = "Информация не указана";
        }
        setTown(town);
        this.town = town;
        if (town == null) {
            this.name = "Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        if (town == null)
            this.name = "Информация не указана";;
    }
    void life() {
        System.out.println(" Привет! Меня зовут" + name + ". Я из города " + town + ". Я родился в "
                + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}