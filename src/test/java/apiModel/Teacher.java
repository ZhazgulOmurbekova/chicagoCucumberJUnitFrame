package apiModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

@Data
public class Teacher {
    String premanentAddress;
    String section;
    String subject;
    int batch;
    String birthDate;
    String department;
    String gender;
    String password;
    String phone;
    String firstName;
    String lastName;
    String emailAddress;
    String joinDate;
    int salary;
    int teacherId;


//    String permanentAddress;
//    int salary;
//    String section;
//    String subject;
//   // String address;
//
//    int batch;
//    String birthDate;
//    String department;
//    String gender;
//    String password;
//    String phone;
//    String firstName;
//    String lastName;
//    String emailAddress;
//    String joinDate;
//    //int salary;
//    // Subject subject;


}
