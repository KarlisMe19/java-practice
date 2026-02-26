public class studentMetrics {
    // Create a program that:
    // Stores students (ID, name, list of grades)
    // Computes:
    // Average grade per student
    // Highest grade
    // Overall class average
    // Allows searching student by ID
    // Displays students sorted by average (highest to lowest)

    String ID, name;
    int[] grades = new int[10];
    float avgGrade;
    int gradeSum = 0;
    int iterator = 0;

    studentMetrics(String ID, String name){
        this.ID = ID;
        this.name = name;
    }

    float computeAvg(int[] grades) {
        for (int studentGrade : grades){
            gradeSum += studentGrade;
            iterator++;
        }
        avgGrade = gradeSum/iterator;
        return avgGrade;
    }

    void printGrades (int[] grades){
        for(int studentGrade : grades){
            System.out.println("The student's grades are: " + studentGrade);
        }
    }

    void printMaxGrade(){
        int highestGrade = 0;
        for (int grade : grades){
            if (grade > highestGrade){
                highestGrade = grade;
            }
        }
        System.out.println("The student's highest grade is: " + highestGrade);
        }
    }
