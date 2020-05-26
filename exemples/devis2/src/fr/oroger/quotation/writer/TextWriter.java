package fr.oroger.quotation.writer;

import fr.oroger.house.House;

public class TextWriter implements QuotationWriter {
    private House mHouse;

    @Override
    public String write() {
        StringBuilder sb = new StringBuilder("=========== DEVIS TEXT =============\n");

        int totalwall,totaldoor,totalwindow,totalroof,totalGarage,totPool;
        totalwall = mHouse.getWallsPrice();
        totaldoor = mHouse.getDoorsPrice();
        totalwindow = mHouse.getWindowsPrice();
        totalroof = mHouse.getRoofPrice();
        totalGarage = mHouse.getGaragePrice();
        totPool = mHouse.getPoolsPrice();
        sb.append("Murs = ").append(totalwall).append("\n");
        sb.append("Porte = ").append(totaldoor).append("\n");
        sb.append("Fenêtre = ").append(totalwindow).append("\n");
        sb.append("Toit = ").append(totalroof).append("\n");
        sb.append("Garage = ").append(totalGarage).append("\n");
        sb.append("Piscine = ").append(totPool).append("\n");

        sb.append("============== TOTAL ================\n");
        sb.append(totalwall+totaldoor+totalwindow+totalroof+totalGarage+totPool);
        return sb.toString();
    }

    @Override
    public void setHouse(House h) {
        mHouse = h;
    }
}
