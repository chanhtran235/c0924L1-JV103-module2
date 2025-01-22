package ss8_mvc.validate;

public class Validate {
    public static boolean checkName(String name){
        String regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
//        if (name.matches(regex)){
//            return true;
//        }
//        throw new Exception("Ten khong hợp lệ");
        return name.matches(regex);
    }
}
