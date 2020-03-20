package apiModel;

import apiModel.Teacher;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Subject  {

    private String name;
    private int year;
    private int batch;

}
