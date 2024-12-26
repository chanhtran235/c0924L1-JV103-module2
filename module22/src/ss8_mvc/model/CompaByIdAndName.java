package ss8_mvc.model;

import java.util.Comparator;

public class CompaByIdAndName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
                if (o1.getId()-o2.getId()==0){
            // săp xếp theo tên
            return  (o1.getName().compareTo(o2.getName()));
        }else {
            return o1.getId()-o2.getId();
        }
    }
}
