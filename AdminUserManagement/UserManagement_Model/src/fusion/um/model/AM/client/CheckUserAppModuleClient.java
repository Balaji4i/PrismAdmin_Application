package fusion.um.model.AM.client;

import fusion.um.model.AM.common.CheckUserAppModule;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jul 21 15:29:05 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CheckUserAppModuleClient extends ApplicationModuleImpl implements CheckUserAppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public CheckUserAppModuleClient() {
    }

    public String CheckUserName(String jwt) {
        Object _ret =
            this.riInvokeExportedMethod(this,"CheckUserName",new String [] {"java.lang.String"},new Object[] {jwt});
        return (String)_ret;
    }
}
