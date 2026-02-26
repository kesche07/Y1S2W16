package Q8;
import java.util.*;

public class CensusProcessor
{
    public static Student[] parseCSV(String[] csvData){
        // student array
        //1 less than data bc head is not included
        Student[] stud = new Student[csvData.length-1];
    
        for(int i=1;i< csvData.length;i++){
            
            //creating new array of fields 
            //splitting by ,
            String[] fields = csvData[i].split(",");
            
            
            String name = fields[0].trim();
            int age = Integer.parseInt(fields[1].trim());
            String school = fields[2].trim();
            int grade = Integer.parseInt(fields[3].trim());
            String citizenship = fields[4].trim();
            String phone = fields[5].trim();
            
            stud[i - 1] = new Student(name, age, school, grade, citizenship, phone);
        }
        return stud;
    }
    
       public static boolean isValidCitizenship(String cit){
        if(cit.length() != 10){
            return false;
        }

        if(cit.charAt(2) != '-'){
            return false;
        }

        // check first 2 digits
        for(int i = 0; i < 2; i++){
            if(!Character.isDigit(cit.charAt(i))){
                return false;
            }
        }

        // check last 7 digits
        for(int i = 3; i < 10; i++){
            if(!Character.isDigit(cit.charAt(i))){
                return false;
            }
        }

        return true;
    }
    
    public static boolean isValidPhone(String num){
        if(num.matches("9[78]\\d{8}")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static Student[] findBySchool(Student[] students, String school){
       ArrayList<Student> det = new ArrayList<>();
       
       for(Student s : students){
           if(s.getSchool().equalsIgnoreCase(school)){
               det.add(s);
           }
       }
       return det.toArray(new Student[0]);
    }
    
    public static int countByGrade(Student[] students, int grade){
        ArrayList<Student> det = new ArrayList<>();
        int num = 0;
        for(Student s : students){
            if(s.getGrade() == grade){
                num++;
            }
        }
        return num;
    }
    
    public static double averageAge(Student[] students){
        int sum=0;
        for(int i=0;i<students.length; i++){
            sum=sum+students[i].getAge();
        }
        return (double)sum / students.length;
    }
    
    public static String findLongestName(Student[] students){
        String longest = "";
        int maxLetters = 0;
        
        for(int i=0;i<students.length; i++)
        {
            StringBuilder sb = new StringBuilder();
            String name = students[i].getName();
        
            // Split into individual characters
            String[] characters = name.split(""); 
        
            for (int j = 0; j < characters.length; j++) {
                // ONLY append if it is NOT a space
                if (!characters[j].equals(" ")) {
                    sb.append(characters[j]);
                }
        }

            // Check if THIS student's letter count is the new record
            if (sb.length() > maxLetters) {
                maxLetters = sb.length();
                longest = name;
            }
    }
    return longest;
}
    
    public static String generateCensusReport(Student[] students){
        int totalStudents = students.length-1; //not including title
        int valid=0;
        int invalid=0;
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<students.length;i++){
            String cit = students[i].getCitizenship();
            String phone = students[i].getPhone();
            
            //Checking if student details are valid
            if(isValidCitizenship(cit) && isValidPhone(phone) == true){
                valid++;
            }
            else{
                invalid++;
            }
        }
        sb.append("===== NEPAL STUDENT CENSUS REPORT =====\n");
        sb.append(String.format("Total: %d | Valid: %d | Invalid: %d\n\n", students.length, valid, invalid));
        sb.append("- Student List: -\n");
        
        for(Student s : students)
        {
            String cit = s.getCitizenship();
            
            String phone = s.getPhone();
            String name = s.getName();
            String initials = s.getNameInitials(name);
            int age= s.getAge();
            int grade =s.getGrade();
            
            boolean validity = isValidCitizenship(cit) && isValidPhone(phone);

            sb.append(String.format("%s \t %s \t\t | %d | Grade %d | %s \n",initials,name,age, grade, validity ? "VALID" : "INVALID"));
            
        }
        
        sb.append("- Statistics -");
        double average = averageAge(students);
        String longest = findLongestName(students);
        int charCount = longest.replace(" ", "").length();
        sb.append(String.format("Average Age: %.2f \n", average));
        sb.append(String.format("Longest Name: %s (%d Characters) \n", longest,charCount));
        
        sb.append("Counts Per School:\n");

        for (int i = 0; i < students.length; i++) {
            String currentSchool = students[i].getSchool();
            boolean alreadyCounted = false;

            // Check if we have already counted this school before
            for (int j = 0; j < i; j++) {
                if (students[j].getSchool().equalsIgnoreCase(currentSchool)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;

                // Count how many students belong to this school
                for (int k = 0; k < students.length; k++) {
                    if (students[k].getSchool().equalsIgnoreCase(currentSchool)) {
                        count++;
                    }
                }

                sb.append(String.format("%s : %d students\n", currentSchool, count));
            }
        }
        
        
        return sb.toString();
    }
}