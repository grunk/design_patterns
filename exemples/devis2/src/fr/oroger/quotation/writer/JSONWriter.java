package fr.oroger.quotation.writer;

import fr.oroger.house.House;

public class JSONWriter implements QuotationWriter {
    private House mHouse;

    @Override
    public String write() {
        StringBuilder sb = new StringBuilder("{");

        int totalwall,totaldoor,totalwindow,totalroof,totalGarage,totPool;
        totalwall = mHouse.getWallsPrice();
        totaldoor = mHouse.getDoorsPrice();
        totalwindow = mHouse.getWindowsPrice();
        totalroof = mHouse.getRoofPrice();
        totalGarage = mHouse.getGaragePrice();
        totPool = mHouse.getPoolsPrice();
        sb.append("murs:").append(totalwall).append(",");
        sb.append("porte:").append(totaldoor).append(",");
        sb.append("fenetre:").append(totalwindow).append(",");
        sb.append("toit:").append(totalroof).append(",");
        sb.append("garage:").append(totalGarage).append(",");
        sb.append("piscine:").append(totPool).append(",");

        sb.append("total:");
        sb.append(totalwall+totaldoor+totalwindow+totalroof+totalGarage+totPool).append("}");
        return sb.toString();
    }

    @Override
    public void setHouse(House h) {
        mHouse = h;
    }
}
