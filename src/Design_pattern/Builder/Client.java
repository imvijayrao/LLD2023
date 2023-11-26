package Design_pattern.Builder;

import Design_pattern.Builder.exceptions.InvalidArgumentException;

public class Client {
    public static void main(String[] args) throws InvalidArgumentException {
        Student student = Student.createBuilder()
                .setAge(23)
                .setName("Vijay")
                .setId(55)
                .setGender(Gender.Male)
                .setUniversityName("SNS Institution")
                .setPhonenumber("9090907890")
                .build();

    }
}
