package fusion.um.model.PROGVO;

import fusion.um.model.POJO.pojo_seg3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 21 22:41:52 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Segment3_PROGVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public Segment3_PROGVOImpl() {
    }

    public Connection getConnectionDS(String dsName) throws NamingException,
                                                            SQLException {
        Connection con = null;
        DataSource datasource = null;
        Context initialContext = new InitialContext();
        if (initialContext == null) {
        }
        datasource = (DataSource)initialContext.lookup(dsName);
        if (datasource != null) {
            con = datasource.getConnection();
        } else {
            System.out.println("Failed to Find JDBC DataSource.");
        }
        return con;
    }


    /**
     * executeQueryForCollection - overridden for custom java data source support.
     */
    protected void executeQueryForCollection(Object qc,Object[] params,
                                             int noUserParams) {
        try {
            populateData();
        } catch (Exception e) {
            System.err.println("===121====" + e.toString());
        }
        setFetchIndex(qc,0);
        super.executeQueryForCollection(qc,params,noUserParams);
        //val="N";
    }

    public void populateData() throws SQLException {       
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        try {
            // con = getConnectionDS("PL");
            stmt = this.getDBTransaction().createStatement(1);
            //step4 execute query
            rs =
 stmt.executeQuery("select * from xxfnd_data_security where SEGMENT_COLUMN='SEGMENT3'");
            String a = null,b = null,c = null,d = null,e = null,Sql = null;
            if (rs.next()) {
                // System.out.println(rs.getString("SRC_TABLE")+"  "+rs.getString("SRC_COLUMN"));
                a = rs.getString("SRC_TABLE");
                b = rs.getString("SRC_COLUMN");
                c = rs.getString("src_disp_column");
                //  rs.getString("src_lookup_type"); //.equalsIgnoreCase(null) ? "1":rs.getString("src_lookup_type");
                //e=(d.equals(null))?"1":d;
                d =
  rs.getString("src_lookup_type") == null ? "null" : rs.getString("src_lookup_type");
            }
            if (!d.equalsIgnoreCase("null")) {

                //Sql = "select LOOKUP_VALUE_NAME,LOOKUP_VALUE_NAME_DISP from xxfnd_lookup_types t, xxfnd_lookup_values v where v.lookup_type_id = t.lookup_type_id and t.lookup_type_name ='USER_ROLE'" ;
                Sql =
"select " + b + "," + c + " from xxfnd_lookup_types t, " + a +
  " v where v.lookup_type_id = t.lookup_type_id and t.lookup_type_name = '" +
  d + "'";
            } else {
                Sql = "select " + b + ", " + c + " from  " + a + " ";
            }
            //            System.err.println("----------------Before While------------------------");
            rs1 = stmt.executeQuery(Sql);
            int i = 0;
            //            System.out.println("db-----------------i" + i++);
            if (!characterList.isEmpty()) {
                characterList.clear();
            }
            while (rs1.next()) {
         
                characterList.add(new pojo_seg3(rs1.getString(1),
                                                rs1.getString(2)));
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
           // con.close();
            stmt.close();
            rs.close();
            rs1.close();
        }
    }

    /**
     * hasNextForCollection - overridden for custom java data source support.
     */
    protected boolean hasNextForCollection(Object qc) {
        //        boolean bRet = super.hasNextForCollection(qc);
        //        return bRet;
        int i = 0;
        //        System.out.println("hasnext-----------------i"+i++);
        return getFetchIndex(qc) < characterList.size();
    }
    private ArrayList<pojo_seg3> characterList = new ArrayList<pojo_seg3>();

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
    protected ViewRowImpl createRowFromResultSet(Object qc,
                                                 ResultSet resultSet) {
        //        System.err.println("object" + qc.toString());
        int curIndex = getFetchIndex(qc);
        //        System.err.println("curIndex" + curIndex);
        // Create a new row
        Segment3_PROGVORowImpl characterRow =
            (Segment3_PROGVORowImpl)createNewRowForCollection(qc);
        //Here set attribute values in new row using RowImpl class
        characterRow.setSeg3Key(characterList.get(curIndex).getId());
        characterRow.setSeg3Value(characterList.get(curIndex).getName());
        // Change the fetch index as one record is increased in result set
        setFetchIndex(qc,curIndex + 1);
        // Return the newly created row
        int i = 0;
        //        System.out.println("rowimpl-----------------i" + i++);
        return characterRow;
    }

    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }

    private void setFetchIndex(Object rowset,int index) {
        if (index == characterList.size()) {
            setFetchCompleteForCollection(rowset,true);
        }
        setUserDataForCollection(rowset,new Integer(index));
        int i = 0;
        //        System.out.println("fetchindex-----------------i" + i++);
    }


    private int getFetchIndex(Object rowset) {
        int value = ((Integer)getUserDataForCollection(rowset)).intValue();
        int i = 0;
        //        System.out.println("getindex-----------------i" + i++);
        return value;
        
        

    }
}
