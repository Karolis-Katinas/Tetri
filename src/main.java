import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Scanner;


public class main{
    public static void main(String[] args) {
        Form form = new Form();
        Map map = new Map();
        Boolean end = false;
        Boolean exit = false;

        Scanner scanner = new Scanner(System.in);
        String cmd = "";

        while(!exit) {
            end = false;
            form.newForm(map);
            map.renderMap(form);
            while (!end) {
                cmd = scanner.next();
                switch (cmd) {
                    case "d":
                        if(!Controller.logic(form, map))
                            Controller.moveRight(form, map);
                        else
                            end = true;
                        break;
                    case "a":
                        if(!Controller.logic(form, map)) {
                            Controller.moveLeft(form, map);
                        }
                        else
                            end = true;
                        break;
                    case "s":
                        Controller.down(form, map);
                        end = true;
                        break;
                    case "w":
                        Controller.changeForm(form, map);
                        break;
                    case "exit":
                        exit = true;
                        end = true;
                        System.out.println("Išjungėte žaidimą!");
                        break;
                    default:
                        System.out.println("Wrong input!\n");
                }
                map.renderMap(form);
                Controller.ifClear(form, map);
                if(Controller.end(map)) {
                    System.out.println("GAME OVER!");
                    exit = true;
                }
            }
        }
    }
}

