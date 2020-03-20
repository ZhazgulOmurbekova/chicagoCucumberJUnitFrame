package api;


import apiModel.RequestBody;
import apiModel.Student;
import apiModel.Teacher;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.APIUtil;

public class utilTesting {

    @Test
    public void teacherTesting() {
        String resource = "/teacher/2192";
        APIUtil.hitGET(resource);
        System.out.println(APIUtil.getResponseBody().getTeachers().get(0).getFirstName());
    }


    @Test
    public void allTeacherTest() {
        APIUtil.hitGET("/teacher/all");

        for (Teacher t : APIUtil.getResponseBody().getTeachers()) {
            if (t.getGender().equalsIgnoreCase("female")) {
                System.out.println(t.getFirstName());
            }
        }
    }

    @Test
    public void student() {
        APIUtil.hitGET("/student/all");
        int index =0;
        for (Student s : APIUtil.getResponseBody().getStudents()) {
            if (s.getBatch() >= 7 && s.getBatch() <= 14) {
                index++;
                continue;
            }

            Assert.fail("student batch failed at " + index);
            System.out.println(s.getFirstName());
            System.out.println("Batch: " + s.getBatch());
            System.out.println();

        }
    }

    @Test
    public void postTesting(){
        RequestBody teacher= new RequestBody();
        teacher.setEmailAddress("jb2020@gmail.com");
        teacher.setFirstName("heyhey");
        teacher.setLastName("hi");
        teacher.setJoinDate("01/02/2031");
        teacher.setSalary(50000);
        teacher.setBatch(14);
        teacher.setBirthDate("01/01/1995");
        teacher.setGender("Male");
        teacher.setPassword("jb123");
        teacher.setPhone("2342-52324");
        teacher.setPremanentAddress("123 main street");
        teacher.setSection("Whatever");
        teacher.setSubject("Intro to Swimming");
        teacher.setDepartment("Sports");

  APIUtil.hitPOST("/teacher/create", teacher);

//        System.out.println(response.asString());
//        Assert.assertEquals("Get API hit faild", 200, response.statusCode());

    }


    @Test
    public void putTeacher(){
        RequestBody teacher= new RequestBody();
        teacher.setEmailAddress("jb2020@gmail.com");
        teacher.setFirstName("sdfg");
        teacher.setLastName("sdfg");
        teacher.setJoinDate("01/02/2031");
        teacher.setSalary(50000);
        teacher.setBatch(14);
        teacher.setBirthDate("01/01/1995");
        teacher.setGender("Male");
        teacher.setPassword("jb123");
        teacher.setPhone("2342-52324");
        teacher.setPremanentAddress("123 main street");
        teacher.setSection("Whatever");
        teacher.setSubject("Intro to Swimming");
        teacher.setDepartment("Sports");
        teacher.setTeacherId(2230);


        APIUtil.hitPUT("/teacher/update",teacher);
    }

    @Test
    public void deleteTeacher(){


        APIUtil.hitDELETE("/teacher/delete/2189");
    }
}
