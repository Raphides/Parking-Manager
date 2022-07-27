import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class UserScreen extends Screens {
    private JButton back, send;
    private JLabel intro;
    private JButton register, takeBack;
    private JLabel allInfoRegister, allInfoTakeBack;
    private Box infoRegister, writeRegister;
    private JTextField name, vehiclePlate;
    private boolean onRegister, onTakeBack;
    private JLabel priceInfo;
    
    
    public UserScreen(SystemApp screenSys, int section) {
        super(screenSys);
        if (section == 0) {
            toUserHome();
        }
        else if (section == 1) {
            toRegister();
        }
        else if (section == -1) {
            toTakeBack();
        }
    }

    // to methods
    public void toUserHome() {
        toPage();
        // Back Btn
        createBackBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toHome();
            }
        });
        // Intro text
        setIntro(new JLabel(
            "<html><h3 align='center'>O que você quer fazer,<br> usuário?</h3>"
            + "<p>Escolha se você quer cadstrar um carro<br>"
            + "e garantir sua vaga, ou retirar o seu carro<br>"
            + "do estacionamento e pagar as devidas taxas.</p></html>"
        ));
        placeElementGrid(getIntro(), 0, 1, 3, 1);

        // register and takeback btns.
        JPanel boxPanel = new JPanel(new FlowLayout());
        placeElementGrid(boxPanel, 0, 2, 3, 1);
        setRegister(new JButton("Cadastrar"));
        getRegister().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                toUser(1);
            }
        });
        setTakeBack(new JButton("Retirar"));
        getTakeBack().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toUser(-1);
                
            }
        });
        boxPanel.add(getRegister());
        boxPanel.add(getTakeBack());
        getScreenSys().pack();

        
    }


    public void toRegister() {
        toPage();
        // back btn
        this.createBackBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toUser(0);
            }
        });

        //intro
        setIntro(new JLabel(
            "<html><h3>Cadastre seu Veículo</h3>"
            + "<p>Preencha as informações abaixo e pressione<br>"
            + "o botão \"Enviar\" no fim da página.<br><br></p></html>"));
        placeElementGrid(getIntro(), 0, 1, 3, 1);


        setInfoRegister(Box.createVerticalBox());
        getInfoRegister().add(Box.createVerticalStrut(25));
        setWriteRegister(Box.createVerticalBox());
        getWriteRegister().add(Box.createVerticalStrut(25));
        
        
        // name
        getInfoRegister().add(new JLabel("Name"));
        setName(new JTextField(20));
        getWriteRegister().add(getName());
        
        // plate
        getInfoRegister().add(new JLabel("Placa"));
        setVehiclePlate(new JTextField(20));
        getWriteRegister().add(getVehiclePlate());
        
        JPanel bPanel = new JPanel(new FlowLayout());
        bPanel.add(getInfoRegister());
        bPanel.add(getWriteRegister());
        placeElementGrid(bPanel, 0, 2);
        
        
        // Send
        setSend(new JButton("Enviar"));
        placeElementGrid(getSend(), 1, 3);

        getScreenSys().pack();


                
    }

    public void toTakeBack() {
        toPage();
        // back btn
        this.createBackBtn(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toUser(0);
            }
        });

        //intro
        setIntro(new JLabel(
            "<html><h3>Retire seu Veículo</h3>"
            + "<p>Digite o seu nome OU a placa<br>do veículo abaixo e pressione<br>"
            + "o botão \"Retirar\" no fim da página.<br><br></p></html>"));
        placeElementGrid(getIntro(), 0, 1, 3, 1);


        setInfoRegister(Box.createVerticalBox());
        getInfoRegister().add(Box.createVerticalStrut(25));
        setWriteRegister(Box.createVerticalBox());
        getWriteRegister().add(Box.createVerticalStrut(25));
        
        
        // name
        getInfoRegister().add(new JLabel("Name"));
        setName(new JTextField(20));
        getWriteRegister().add(getName());
        
        // plate
        getInfoRegister().add(new JLabel("Placa"));
        setVehiclePlate(new JTextField(20));
        getWriteRegister().add(getVehiclePlate());
        
        JPanel bPanel = new JPanel(new FlowLayout());
        bPanel.add(getInfoRegister());
        bPanel.add(getWriteRegister());
        placeElementGrid(bPanel, 0, 2);
        // Send
        setSend(new JButton("Retirar"));
        placeElementGrid(getSend(), 1, 3);
        
        getScreenSys().pack();
        //checker
    
    }

    public void createBackBtn(ActionListener backto) {
        setBack(new JButton("Voltar"));
        placeElementGrid(getBack(), 0, 0);
        getBack().addActionListener(backto);

    }

    public void addonDB() {
        
    }

    // getters and setters
    public JButton getBack() {
        return back;
    } public void setBack(JButton back) {
        this.back = back;
    } public JButton getSend() {
        return send;
    } public void setSend(JButton send) {
        this.send = send;
    } public JTextField getName() {
        return name;
    } public void setName(JTextField name) {
        this.name = name;
    } public JTextField getVehiclePlate() {
        return vehiclePlate;
    } public void setVehiclePlate(JTextField vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    } public JLabel getIntro() {
        return intro;
    } public void setIntro(JLabel intro) {
        this.intro = intro;
    } public JButton getRegister() {
        return register;
    } public void setRegister(JButton register) {
        this.register = register;
    } public JButton getTakeBack() {
        return takeBack;
    } public void setTakeBack(JButton takeBack) {
        this.takeBack = takeBack;
    } public JLabel getAllInfoRegister() {
        return allInfoRegister;
    } public void setAllInfoRegister(JLabel allInfoRegister) {
        this.allInfoRegister = allInfoRegister;
    } public JLabel getAllInfoTakeBack() {
        return allInfoTakeBack;
    } public void setAllInfoTakeBack(JLabel allInfoTakeBack) {
        this.allInfoTakeBack = allInfoTakeBack;
    } public boolean isOnRegister() {
        return onRegister;
    } public void setOnRegister(boolean onRegister) {
        this.onRegister = onRegister;
    } public boolean isOnTakeBack() {
        return onTakeBack;
    } public void setOnTakeBack(boolean onTakeBack) {
        this.onTakeBack = onTakeBack;
    } public JLabel getPriceInfo() {
        return priceInfo;
    } public void setPriceInfo(JLabel priceInfo) {
        this.priceInfo = priceInfo;
    } public Box getInfoRegister() {
        return infoRegister;
    } public void setInfoRegister(Box infoRegister) {
        this.infoRegister = infoRegister;
    } public Box getWriteRegister() {
        return writeRegister;
    } public void setWriteRegister(Box writeRegister) {
        this.writeRegister = writeRegister;
    }

}
