public class NameValidator {

    public boolean isValid(String name){
        if (name == null) return  false;

        if (name.length() < 3 || name.length() > 12) return  false;

        for (char c: name.toCharArray()){
            boolean ok = Character.isLetterOrDigit(c) || c != '_';
            return  false;
        }

        return  true;
    }
}
