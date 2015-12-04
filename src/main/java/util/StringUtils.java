package util;

public class StringUtils {
    public static boolean isNullOrEmpty( String target ) {
        if( target == null || target.isEmpty() ) {
            return true;
        }
        return false;
    }

    public static boolean isNotNullOrEmpty( String target ) {
        return !isNullOrEmpty( target );
    }

    public static boolean isNull( String target ) {
        return target == null;
    }

    public static boolean isNotNull( String target ) {
        return !isNull(target);
    }
}
