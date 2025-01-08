package ss8_mvc.service;


import ss8_mvc.model.CompaByIdAndName;
import ss8_mvc.model.CompaByName;
import ss8_mvc.model.Student;
import ss8_mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// các method CRUD Student
public class StudentService implements IStudentService {
    private final String STUDENT_FILE = "src/ss8_mvc/data/student.csv";
    private final String STUDENT_DAT_FILE = "src/ss8_mvc/data/student.dat";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        // đọc file
//        List<String> stringList = ReadAndWriteFile.readFile(STUDENT_FILE);
//        //  chuyển dữ liệu stringList sang studentList;
//        String [] array;
//        for (int i = 0; i <stringList.size() ; i++) {
//            array = stringList.get(i).split(",");
//            Student student = new Student(Integer.parseInt(array[0]),array[1]);
//            studentList.add(student);
//        }

        // đọc file nhị phân
        studentList = ReadAndWriteFile.readListObjectFromDat(STUDENT_DAT_FILE);
        return studentList;
    }

    @Override
    public void add(Student student) {
        // character
//        List<String> stringList = new ArrayList<>();
//        stringList.add(student.getInfoToFile());
//        ReadAndWriteFile.writeFile(STUDENT_FILE,stringList,APPEND);
        // binary
        List<Student> studentList = ReadAndWriteFile.readListObjectFromDat(STUDENT_DAT_FILE);
        studentList.add(student);
        ReadAndWriteFile.writeListSObjectToDat(STUDENT_DAT_FILE,studentList);
    }

    @Override
    public boolean deleteById(int id) {
        List<Student> studentList = findAll();
        boolean check = false;
        for (int i = 0; i <studentList.size() ; i++) {
            if (id==studentList.get(i).getId()){
                check = true;
                studentList.remove(i);
               break;
            }
        }
        // nếu tìm thấy thì update file
        if (check){
            // sử dụng character
            // chuyển studentlist => stringList
//            List<String> stringList = new ArrayList<>();
//            for (Student s: studentList) {
//                stringList.add(s.getInfoToFile());
//            }
//            ReadAndWriteFile.writeFile(STUDENT_FILE,stringList,NOT_APPEND);
//
            // sử dụng binary
            ReadAndWriteFile.writeListSObjectToDat(STUDENT_DAT_FILE,studentList);
        }
        return check;
    }

}
