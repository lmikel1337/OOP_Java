import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human_Res_Dep {
    public boolean id (String id){
        String idPattern = "\\w+";
        if (id.matches(idPattern))
            return true;
        return false;
    }

    public boolean passport(String data){
        String typePattern = "[A-Z\\d]{8}";
        if(data.matches(typePattern))
            return true;
        return false;

    }
    public boolean education (String education){
        String typePattern = "[a-zA-Z]+";
        if (education.matches(typePattern)){
            return true;
        }
        return false;
    }

    public boolean character (String character){
        String reasonPattern = ".+";
        if (character.matches(reasonPattern))
            return true;
        return false;
    }

    public boolean salary (String salary){
        String reasonPattern = "\\d+";
        if (salary.matches(reasonPattern))
            return true;
        return false;
    }
    public boolean career(String [] career){
        String typePattern = "\\d{2}\\.\\d{2}\\.\\d{4}";
        String type1Pattern = "[a-zA-Z]+";
        if(career[0].matches(typePattern) && career[1].matches(type1Pattern) && career[2].matches(type1Pattern))
            return true;
        return false;
    }



}
