import javax.swing.*;;

public class AdmScreen extends Screens {
    private JLabel intro;
    private JTextField name, capacity,
    fractionValue, hourValue, dailyValue, nightValue, eventValue, memberValue, contractorValue; 
    private JComboBox year, month, day, hour, minute;
    public AdmScreen(SystemApp screenSys, int section) {
        super(screenSys);
        PasswordValidation senha = new PasswordValidation();
        // wrong password
        if (senha.validate() == 1) {
            
        }

        // first time
        else if (senha.validate() == 2) {

        }
        //correct password
        else if (senha.validate() == 0) {
            this.intro = new JLabel(
            "<html><h3>Bem Vindo,<br> Administrador!"
            + "</p></html>"
            );
        }



            
        }
    }


