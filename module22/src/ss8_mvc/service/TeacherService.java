package ss8_mvc.service;

import ss8_mvc.model.Teacher;
import ss8_mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements ITeacherService{
      private final String TEACHER_DAT_FILE ="src/ss8_mvc/data/teacher.dat";
    @Override
    public List<Teacher> findAll() {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList = ReadAndWriteFile.readListObjectFromDat(TEACHER_DAT_FILE);
        return teacherList ;
    }

    @Override
    public void add(Teacher teacher) {
        List<Teacher>  teacherList = ReadAndWriteFile.readListObjectFromDat(TEACHER_DAT_FILE);
        teacherList.add(teacher);
        ReadAndWriteFile.writeListSObjectToDat(TEACHER_DAT_FILE,teacherList);
    }
}
