package fusion.um.model.AM.client;

import fusion.um.model.AM.common.Functions_AM;

import java.util.ArrayList;

import java.util.Map;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 25 18:39:30 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Functions_AMClient extends ApplicationModuleImpl implements Functions_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public Functions_AMClient() {
    }

    public ArrayList getLOVValues(String tableName, String value,
                                  String displayValue, String lookupType) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getLOVValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {tableName, value, displayValue, lookupType});
        return (ArrayList)_ret;
    }

    public Map applicationSessionSetup() {
        Object _ret =
            this.riInvokeExportedMethod(this,"applicationSessionSetup",null,null);
        return (Map)_ret;
    }
}
