package util.kotlin

public class StringUtils {
   public fun isNullOrEmpty( target : String ) : Boolean {
      if( target == null || target.isEmpty() ) {
         return true;
      }
      return false;
   }

   fun isNotNullOrEmpty( target : String ) : Boolean {
      return !isNullOrEmpty( target );
   }

   fun isNull( target : String ) : Boolean {
      return target == null;
   }

   fun isNotNull( target : String ) : Boolean {
      return !isNull( target );
   }
}