import java.awt.*;

public class Form {
    private int ax;
    private int ay;
    private int bx;
    private int by;
    private int cx;
    private int cy;
    private int dx;
    private int dy;
    private String name;
    int form;

    public Form() {
    }

    public void newForm(Map map) {
        int number = (int) (Math.random() * 7) + 1;
        if (number == 1) {
            form = 1;
            ax = map.width()/2 - 2;
            ay = 0;
            bx = map.width()/2 - 1;
            by = 0;
            cx = map.width()/2;
            cy = 0;
            dx = map.width()/2 + 1;
            dy = 0;
            name = "a";
       }

        else if (number == 2) {
            form = 1;
            ax = map.width()/2 - 1;
            ay = 0;
            bx = map.width()/2;
            by = 0;
            cx = map.width()/2 -1;
            cy = 1;
            dx = map.width()/2;
            dy = 1;
            name = "b";
        }

        else if (number == 3) {
            form = 1;
            ax = map.width()/2 - 1;
            ay = 1;
            bx = map.width()/2 - 1;
            by = 0;
            cx = map.width()/2;
            cy = 0;
            dx = map.width()/2 + 1;
            dy = 0;
            name = "c";
        }

        else if (number == 4) {
            form = 1;
            ax = map.width()/2 - 1;
            ay = 0;
            bx = map.width()/2;
            by = 0;
            cx = map.width()/2 + 1;
            cy = 0;
            dx = map.width()/2 + 1;
            dy = 1;
            name = "d";
        }

        else if (number == 5) {
            form = 1;
            ax = map.width()/2 - 1;
            ay = 0;
            bx = map.width()/2;
            by = 0;
            cx = map.width()/2 + 1;
            cy = 0;
            dx = map.width()/2;
            dy = 1;
            name = "e";
        }

        else if (number == 6) {
            form = 1;
            ax = map.width()/2 - 1;
            ay = 0;
            bx = map.width()/2;
            by = 0;
            cx = map.width()/2;
            cy = 1;
            dx = map.width()/2 + 1;
            dy = 1;
            name = "f";
        }

        else if (number == 7) {
            form = 1;
            ax = map.width()/2 + 1;
            ay = 0;
            bx = map.width()/2;
            by = 0;
            cx = map.width()/2;
            cy = 1;
            dx = map.width()/2 - 1;
            dy = 1;
            name = "g";
        }

        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.dx = dx;
        this.dy = dy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void aMoveUp(){
        ay--;
    }
    public void aMoveDown(){
        ay++;
    }
    public void aMoveLeft(){
        ax--;
    }
    public void aMoveRight(){
        ax++;
    }

    public void bMoveUp(){
        by--;
    }
    public void bMoveDown(){
        by++;
    }
    public void bMoveLeft(){
        bx--;
    }
    public void bMoveRight(){
        bx++;
    }

    public void cMoveUp(){
        cy--;
    }

    public void cMoveDown(){
        cy++;
    }
    public void cMoveLeft(){
        cx--;
    }
    public void cMoveRight(){
        cx++;
    }

    public void dMoveUp(){
        dy--;
    }

    public void dMoveDown(){
        dy++;
    }
    public void dMoveLeft(){
        dx--;
    }
    public void dMoveRight(){
        dx++;
    }


    public int getAx() {
        return ax;
    }

    public int getAy() {
        return ay;
    }

    public int getBx() {
        return bx;
    }

    public int getBy() {
        return by;
    }

    public int getCx() {
        return cx;
    }

    public int getCy() {
        return cy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public void setAx(int ax) {
        this.ax = ax;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public void setBx(int bx) {
        this.bx = bx;
    }

    public void setBy(int by) {
        this.by = by;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }
}
