package after_class_projects;

public class report_card {
    System.out.print("Enter Student Name: ");
    String studentName = readString();

    System.out.print("Enter Roll Number (Integer): ");
    int rollNumber = readInt();

    System.out.print("Enter marks for Math (0-100): ");
    float math = readFloat();

    System.out.print("Enter marks for Science (0-100): ");
    float science = readFloat();

    System.out.print("Enter marks for English (0-100): ");
    float english = readFloat();

    int totalSubjects = 3;
    float totalMarks = math + science + english;
    float averagePercentage = totalMarks / totalSubjects;

    char grade;
    String feedback;

    if(averagePercentage>=90.0f)
    {
        grade = 'A';
        feedback = "Excellent performance! Keep up the brilliant work.";
    }else if(averagePercentage>=75.0f)
    {
        grade = 'B';
        feedback = "Good job! Consistent effort will lead to even better results.";
    }else if(averagePercentage>=50.0f)
    {
        grade = 'C';
        feedback = "Fair performance. Needs more focus on weak areas.";
    }else
    {
        grade = 'F';
        feedback = "Needs Improvement. Please seek extra help and study regularly.";
    }

    System.out.println("\n========================================");
    System.out.println("               REPORT CARD              ");
    System.out.println("========================================");
    System.out.println("Student Name : "+studentName);
    System.out.println("Roll Number  : "+rollNumber);
    System.out.println("----------------------------------------");
    System.out.println("Math         : "+math);
    System.out.println("Science      : "+science);
    System.out.println("English      : "+english);
    System.out.println("----------------------------------------");
    System.out.println("Total Marks  : "+totalMarks+" / 300.0");
    System.out.println("Percentage   : "+averagePercentage+"%");
    System.out.println("Final Grade  : "+grade);
    System.out.println("Feedback     : "+feedback);
    System.out.println("========================================");
}

}