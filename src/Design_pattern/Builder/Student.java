package Design_pattern.Builder;

import Design_pattern.Builder.exceptions.InvalidArgumentException;

public class Student {
    private String name;
    private int age;
    private int id;
    private String universityName;
    private Gender gender;
    private String phonenumber;

    private Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
        this.id = builder.getId();
        this.universityName = builder.getUniversityName();
        this.phonenumber = builder.getPhonenumber();
    }

    public static Builder createBuilder(){
        return new Builder();
    }

    static class Builder{
        private String name;
        private int age;
        private int id;
        private String universityName;
        private Gender gender;
        private String phonenumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            System.out.println("New ID is created");
            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            System.out.println("University name is registered");
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Gender getGender() {
            return gender;
        }

        public Builder setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        private boolean validate(){
            if(this.phonenumber.length()!=10){
                return false;
            }
            System.out.println("Phone number is validated");
            return true;
        }

        public Student build() throws InvalidArgumentException {
            if(!validate()){
                throw new InvalidArgumentException().Invalidphonenumer();
            }
            System.out.println("New object is Assigned");
            return new Student(this);
        }
    }
}
