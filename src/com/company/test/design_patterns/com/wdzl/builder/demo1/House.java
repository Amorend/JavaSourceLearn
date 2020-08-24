package com.company.test.design_patterns.com.wdzl.builder.demo1;

public class House {
    private String wallColor;
    private String ceilColor;
    private String floorColor;
    public void ceil(String ceilColor){
        System.out.println("吊顶");
        this.ceilColor=ceilColor;
    }
    public void floor(String floorColor){
        System.out.println("铺地板");
        this.floorColor =  floorColor;
    }
    public void wall(String wallColor){
        System.out.println("刷墙");
        this.wallColor = wallColor;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public String getCeilColor() {
        return ceilColor;
    }

    public void setCeilColor(String ceilColor) {
        this.ceilColor = ceilColor;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public void setFloorColor(String floorColor) {
        this.floorColor = floorColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "wallColor='" + wallColor + '\'' +
                ", ceilColor='" + ceilColor + '\'' +
                ", floorColor='" + floorColor + '\'' +
                '}';
    }
}
