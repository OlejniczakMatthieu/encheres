package controller;

import model.HotelDesVentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurUtilisateur implements ActionListener {

    private HotelDesVentes hdv;

    public EcouteurUtilisateur(HotelDesVentes hdv) {
        this.hdv = hdv;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
