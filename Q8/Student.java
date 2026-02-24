package Q8;



public class Student
{
    
    private String name;
    private int age;
    private String school;
    private int grade;
    private String citizenship;
    private String phone;
    
    public Student(String name, int age, String school, int grade, String citizenship, String phone)
    {
        this.name=name;
        this.age=age;
        this.school=school;
        this.grade=grade;
        this.citizenship=citizenship;
        this.phone=phone;
    }
    
    //getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSchool(){
        return this.school;
    }
    public int getGrade(){
        return this.grade;
    }
    public String getCitizenship(){
        return this.citizenship;
    }
    public String getPhone(){
        return this.phone;
    }
    
    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void setCitizenship(String citizenship){
        this.citizenship=citizenship;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    @Override
    public String toString(){
        return String.format("%s | %d | Grade %d | %s ",name,age,grade,school);
    }
    
    public String getNameInitials(String name){
        String[] parts= name.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String i : parts){
            sb.append(i.charAt(0)).append(".");
        }
        return sb.toString();
    }

}