import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;

public abstract class Screens {
    private SystemApp screenSys;
    private GridBagLayout localLayout;
    private GridBagConstraints localLayoutProperties;

    
    Screens(SystemApp screenSys) {
        setScreenSys(screenSys); // confirmar que as configurações de SystemApp estão conectadas à classe.
        setLocalLayout(new GridBagLayout()); // escolhido o layout da página local como GridBag.
        getScreenSys().setLayout(getLocalLayout()); // definido o layout da página local como GridBag.
        setLocalLayoutProperties(new GridBagConstraints()); // criar a API de customização GridBag.
}

    // getters and setters
    public SystemApp getScreenSys() {
        return screenSys;
    } public void setScreenSys(SystemApp screenSys) {
        this.screenSys = screenSys;
    } public GridBagLayout getLocalLayout() {
        return localLayout;
    } public void setLocalLayout(GridBagLayout localLayout) {
        this.localLayout = localLayout;
    } public GridBagConstraints getLocalLayoutProperties() {
        return localLayoutProperties;
    } public void setLocalLayoutProperties(GridBagConstraints localLayoutProperties) {
        this.localLayoutProperties = localLayoutProperties;
    } 


    protected void placeElementGrid(Component item, int gridx, int gridy) {
        getLocalLayoutProperties().gridx = gridx;
        getLocalLayoutProperties().gridy = gridy;
        getLocalLayout().setConstraints(item, getLocalLayoutProperties());
        getScreenSys().getContentPane().add(item);


    }
    protected void placeElementGrid(Component item, int gridx, int gridy, int gridwidth, int gridheight) {
        getLocalLayoutProperties().gridx = gridx;
        getLocalLayoutProperties().gridy = gridy;
        getLocalLayoutProperties().gridwidth = gridwidth;
        getLocalLayoutProperties().gridheight = gridheight;
        getLocalLayout().setConstraints(item, getLocalLayoutProperties());
        getScreenSys().getContentPane().add(item);

    }
    protected void toPage() {getScreenSys().getContentPane().removeAll();}
    public void toHome() {toPage(); getScreenSys().setPage(new HomeScreen(screenSys));}
    public void toUser(int section) {toPage(); getScreenSys().setPage(new UserScreen(screenSys, section));}
    public void toAdm(int section) {toPage(); getScreenSys().setPage(new AdmScreen(screenSys, section));}

}
