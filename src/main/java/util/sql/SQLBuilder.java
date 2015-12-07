package util.sql;

import util.StringUtils;

public class SQLBuilder  {

    private StringBuilder builder = new StringBuilder();

    private String tableName;

    private String[] columns = null;

    /**
     * Constructor
     *
     */
    public SQLBuilder() {}

    /**
     * append [SELECT column]
     *
     * @param column
     * @return
     */
    public SQLBuilder select( String... column ) {
        this.columns = column;
        return this;
    }

    /**
     * append [SELECT *]
     *
     * @return {@link SQLBuilder}
     */
    public SQLBuilder selectAll() {
        this.columns = new String[]{};
        return this;
    }



    /**
     * append [FROM xxx]
     *
     * @param tableName
     * @return {@link SQLBuilder}
     */
    public SQLBuilder from( String tableName ) {
        this.tableName = tableName;
        return this;
    }

    /**
     * SQL Build
     *
     * @return SQL
     */
    public String build() {
        // Null or Blank Check
        if( StringUtils.isNull( this.columns ) || StringUtils.isNullOrEmpty( this.tableName ) ) {
            throw new NullPointerException("カラムまたはテーブルが指定されておりません。");
        }

        // SELECT Build
        builder.append( "SELECT " );

        if( this.columns.length > 0 ) {
            String select = "";
            for( String column : this.columns ) {
                select = select.concat(column).concat( "," );
            }
            builder.append( select ) ;
        } else {
            builder.append( "* " );
        }

        builder.append( "FROM " );
        builder.append( tableName );
        return builder.toString();
    }
}
