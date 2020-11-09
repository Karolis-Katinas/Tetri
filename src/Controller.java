import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Controller {

    public static void isFormChangeable(Form form, Map map){
        if(form.getAx()<0 || form.getBx()<0 || form.getCx() < 0 || form.getDx() <0)
        {
            form.aMoveRight();
            form.bMoveRight();
            form.cMoveRight();
            form.dMoveRight();
        }
        else if(form.getAx()>=map.width() || form.getBx()>=map.width() || form.getCx() >= map.width() || form.getDx() >=map.width())
        {
            form.aMoveLeft();
            form.bMoveLeft();
            form.cMoveLeft();
            form.dMoveLeft();
        }
        else if(form.getAy()>23|| form.getBy()>23 || form.getCy() >23 || form.getDy() >23)
        {
            form.aMoveUp();
            form.bMoveUp();
            form.cMoveUp();
            form.dMoveUp();
        }
        else if (map.getElemenOfModel(form.getAy(), form.getAx()) == 1 ||
                map.getElemenOfModel(form.getBy(), form.getBx()) == 1 ||
                map.getElemenOfModel(form.getCy(), form.getCx()) == 1 ||
                map.getElemenOfModel(form.getDy(), form.getDx()) == 1)
        {
            form.aMoveUp();
            form.bMoveUp();
            form.cMoveUp();
            form.dMoveUp();
        }
        if (form.getAy() < 0 || form.getBy() < 0 || form.getCy() <0 || form.getDy() <0){
            form.aMoveDown();
            form.bMoveDown();
            form.cMoveDown();
            form.dMoveDown();
        }
    }

    public static void changeForm(Form form, Map map){
        if(form.getName() == "a")
        {
            if (form.getForm()==1){
                form.aMoveUp();
                form.aMoveUp();
                form.aMoveUp();
                form.bMoveLeft();
                form.bMoveUp();
                form.bMoveUp();
                form.cMoveLeft();
                form.cMoveLeft();
                form.cMoveUp();
                form.dMoveLeft();
                form.dMoveLeft();
                form.dMoveLeft();
                form.setForm(2);
            }
            else {
                form.aMoveDown();
                form.aMoveDown();
                form.aMoveDown();
                form.bMoveRight();
                form.bMoveDown();
                form.bMoveDown();
                form.cMoveRight();
                form.cMoveRight();
                form.cMoveDown();
                form.dMoveRight();
                form.dMoveRight();
                form.dMoveRight();
                form.setForm(1);

            }
        }
        else if(form.getName() == "c") {
            if (form.getForm()==1){
                form.aMoveUp();
                form.bMoveRight();
                form.cMoveDown();
                form.dMoveDown();
                form.dMoveDown();
                form.dMoveLeft();
                form.setForm(2);
            }
            else if(form.getForm()==2){
                form.aMoveRight();
                form.bMoveDown();
                form.cMoveLeft();
                form.dMoveLeft();
                form.dMoveLeft();
                form.dMoveUp();
                form.setForm(3);
            }
            else if(form.getForm()==3){
                form.aMoveDown();
                form.aMoveDown();
                form.bMoveDown();
                form.bMoveLeft();
                form.dMoveUp();
                form.dMoveRight();
                form.setForm(4);
            }
            else {
                form.aMoveLeft();
                form.aMoveUp();
                form.bMoveUp();
                form.bMoveUp();
                form.cMoveUp();
                form.cMoveRight();
                form.dMoveRight();
                form.dMoveRight();
                form.setForm(1);
            }
        }
        else if(form.getName() == "d"){
            if (form.getForm() == 1){
                form.aMoveRight();
                form.aMoveRight();
                form.bMoveDown();
                form.bMoveRight();
                form.cMoveDown();
                form.cMoveDown();
                form.dMoveDown();
                form.dMoveLeft();
                form.setForm(2);
            }
            else if(form.getForm() == 2){
                form.aMoveDown();
                form.aMoveDown();
                form.bMoveDown();
                form.bMoveLeft();
                form.cMoveLeft();
                form.cMoveLeft();
                form.dMoveLeft();
                form.dMoveUp();
                form.setForm(3);
            }
            else if(form.getForm() == 3){
                form.aMoveLeft();
                form.aMoveLeft();
                form.bMoveLeft();
                form.bMoveUp();
                form.cMoveUp();
                form.cMoveUp();
                form.dMoveUp();
                form.dMoveRight();
                form.setForm(4);
            }
            else{
                form.aMoveUp();
                form.aMoveUp();
                form.bMoveUp();
                form.bMoveRight();
                form.cMoveRight();
                form.cMoveRight();
                form.dMoveRight();
                form.dMoveDown();
                form.setForm(1);
            }
        }
        else if(form.getName() == "e"){
            if(form.getForm()==1){
                form.aMoveRight();
                form.aMoveRight();
                form.bMoveRight();
                form.bMoveDown();
                form.cMoveDown();
                form.cMoveDown();
                form.setForm(2);
            }
            else if(form.getForm()==2){
                form.aMoveDown();
                form.aMoveDown();
                form.bMoveDown();
                form.bMoveLeft();
                form.cMoveLeft();
                form.cMoveLeft();
                form.setForm(3);
            }
            else if(form.getForm()==3){
                form.aMoveLeft();
                form.aMoveLeft();
                form.bMoveLeft();
                form.bMoveUp();
                form.cMoveUp();
                form.cMoveUp();
                form.setForm(4);
            }
            else{
                form.aMoveUp();
                form.aMoveUp();
                form.bMoveUp();
                form.bMoveRight();
                form.cMoveRight();
                form.cMoveRight();
                form.setForm(1);
            }
        }
        else if(form.getName() == "f") {
            if (form.getForm() == 1)
            {
                form.aMoveDown();
                form.aMoveDown();
                form.bMoveLeft();
                form.bMoveDown();
                form.dMoveUp();
                form.dMoveLeft();
                form.setForm(2);
            }
            else if (form.getForm()==2) {
                form.aMoveUp();
                form.aMoveUp();
                form.bMoveRight();
                form.bMoveUp();
                form.dMoveDown();
                form.dMoveRight();
                form.setForm(1);
            }
        }
        else if(form.getName()=="g"){
            if(form.getForm()==1){
                form.aMoveDown();
                form.aMoveDown();
                form.bMoveRight();
                form.bMoveDown();
                form.dMoveUp();
                form.dMoveRight();
                form.setForm(2);
            }
            else{
                form.aMoveUp();
                form.aMoveUp();
                form.bMoveLeft();
                form.bMoveUp();
                form.dMoveDown();
                form.dMoveLeft();
                form.setForm(1);
            }
        }
        Controller.skip(form, map);
        Controller.isFormChangeable(form, map);
        Controller.isFormChangeable(form, map);
        Controller.isFormChangeable(form, map);
        Controller.isFormChangeable(form, map);
    }

    public static void ifClear(Form form, Map map){
        for (int y=0; y<map.height(); y++)
        {
            int count = 0;
            for (int x=0; x<map.width(); x++)
            {
                if(map.getElemenOfModel(y, x) == 1)
                count ++;
            }
            if(count == map.width())
            clear(form, map, y);
        }
    }

    public static void clear(Form form, Map map, int yaxis){
        for (int x=0; x<map.width(); x++) {
            map.setElemenOfModel(yaxis, x, 0);
        }
        for (int y=yaxis; y>0; y--) {
            for (int x = 0; x < map.width(); x++) {
                map.setElemenOfModel(y, x, map.getElemenOfModel(y-1, x));
                map.setElemenOfModel(y-1, x, 0);
            }
        }
    }

    public static Boolean logic(Form form, Map map){
        try {
            if (map.getElemenOfModel(form.getAy()+1, form.getAx()) != 0
                    || map.getElemenOfModel(form.getBy()+1, form.getBx()) != 0
                    || map.getElemenOfModel(form.getCy()+1, form.getCx()) != 0
                    || map.getElemenOfModel(form.getDy()+1, form.getDx()) != 0) {

                map.setElemenOfModel(form.getAy(), form.getAx(), 1);
                map.setElemenOfModel(form.getBy(), form.getBx(), 1);
                map.setElemenOfModel(form.getCy(), form.getCx(), 1);
                map.setElemenOfModel(form.getDy(), form.getDx(), 1);
                return true;
            }
            else return false;
        }
        catch(Exception e){
            map.setElemenOfModel(form.getAy(), form.getAx(), 1);
            map.setElemenOfModel(form.getBy(), form.getBx(), 1);
            map.setElemenOfModel(form.getCy(), form.getCx(), 1);
            map.setElemenOfModel(form.getDy(), form.getDx(), 1);
            return true;
        }
    }

    public static void down(Form form, Map map){
        try {
            while (map.getElemenOfModel(form.getAy() +1, form.getAx()) == 0
                    && map.getElemenOfModel(form.getBy() +1, form.getBx()) == 0
                    && map.getElemenOfModel(form.getCy() +1, form.getCx()) == 0
                    && map.getElemenOfModel(form.getDy() +1, form.getDx()) == 0) {

                form.setAy(form.getAy() + 1);
                form.setBy(form.getBy() + 1);
                form.setCy(form.getCy() + 1);
                form.setDy(form.getDy() + 1);
            }
        }
        catch (Exception e)
        {
            map.setElemenOfModel(form.getAy(), form.getAx(), 1);
            map.setElemenOfModel(form.getBy(), form.getBx(), 1);
            map.setElemenOfModel(form.getCy(), form.getCx(), 1);
            map.setElemenOfModel(form.getDy(), form.getDx(), 1);
        }
        map.setElemenOfModel(form.getAy(), form.getAx(), 1);
        map.setElemenOfModel(form.getBy(), form.getBx(), 1);
        map.setElemenOfModel(form.getCy(), form.getCx(), 1);
        map.setElemenOfModel(form.getDy(), form.getDx(), 1);
    }

    public static void skip(Form form, Map map){
        form.setAy(form.getAy()+1);
        form.setBy(form.getBy()+1);
        form.setCy(form.getCy()+1);
        form.setDy(form.getDy()+1);
    }


    public static void moveRight(Form form, Map map) {
        if (form.getAx()+1< map.width() && form.getBx()+1< map.width() && form.getCx()+1< map.width()&&form.getDx()+1< map.width()) {
            if (map.getElemenOfModel(form.getAy()+1, form.getAx()+1) != 1 &&
                    map.getElemenOfModel(form.getBy()+1, form.getBx()+1) != 1 &&
                    map.getElemenOfModel(form.getCy()+1, form.getCx()+1) != 1 &&
                    map.getElemenOfModel(form.getDy()+1, form.getDx()+1) != 1) {
                {
                    form.setAx(form.getAx() + 1);
                    form.setBx(form.getBx() + 1);
                    form.setCx(form.getCx() + 1);
                    form.setDx(form.getDx() + 1);
                }
            }
        }
        form.setAy(form.getAy() + 1);
        form.setBy(form.getBy() + 1);
        form.setCy(form.getCy() + 1);
        form.setDy(form.getDy() + 1);
    }

    public static void moveLeft(Form form, Map map) {
        if (form.getAx() > 0 && form.getBx() > 0 && form.getCx() > 0 && form.getDx() > 0) {
            if (map.getElemenOfModel(form.getAy() + 1, form.getAx() - 1) != 1 &&
                    map.getElemenOfModel(form.getBy() + 1, form.getBx() - 1) != 1 &&
                    map.getElemenOfModel(form.getCy() + 1, form.getCx() - 1) != 1 &&
                    map.getElemenOfModel(form.getDy() + 1, form.getDx() - 1) != 1) {
                {
                    form.setAx(form.getAx() - 1);
                    form.setBx(form.getBx() - 1);
                    form.setCx(form.getCx() - 1);
                    form.setDx(form.getDx() - 1);
                }
            }
        }
        form.setAy(form.getAy() + 1);
        form.setBy(form.getBy() + 1);
        form.setCy(form.getCy() + 1);
        form.setDy(form.getDy() + 1);
    }
    public static Boolean end(Map map){
        {
            for(int x = 0; x < map.width(); x++){
                if(map.getElemenOfModel(0, x) == 1)
                    return true;
            }
            return false;
        }
    }
}
