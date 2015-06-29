
public class Replace {
    public static void main(String[] args) {
        String str = "@aa @bx @ca @ax";
        System.out.println("Original String: "+str);
        System.out.println("------------------------");
        
        /* replace '@a' with 's' */
        System.out.println("replace: "+str.replace("@a", "s"));
        
        /* replace can't process REGULAR EXPRESSION */
        System.out.println("replace(with regexp): "+str.replace("@[a-z]*", "s"));
        
        /**
         * replaceAll can process REGULAR EXPRESSION
         * Replace any String followed by '@'
         */
        System.out.println("replaceAll: "+str.replaceAll("@[a-z]*", "s"));
    }
}

