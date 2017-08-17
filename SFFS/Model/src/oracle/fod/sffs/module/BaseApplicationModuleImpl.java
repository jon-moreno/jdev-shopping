package oracle.fod.sffs.module;

import oracle.jbo.server.ApplicationModuleImpl;

public class BaseApplicationModuleImpl extends ApplicationModuleImpl {
    private String mCurrentUser = null;
    public BaseApplicationModuleImpl() {
        super();
    }

    @Override
    public String getUserPrincipalName() {
        if(mCurrentUser == null) {
            String userPrincipal = "Xanieros";
            mCurrentUser = userPrincipal;
        }
        return mCurrentUser;
    }
}
