/* autogenerated by Processing revision 1286 on 2022-10-18 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Processing extends PApplet {

// //BOTONS
int pantallaX = 800;
int pantallaY = 600;
int butonsP2X = 1;
// AQUESTA VARIABLE LI DIU AL PROGRAMA QUINA PANTALLA HA DE MOSTRAR. LA INICIALITZEM AMB VALOR 1 PER MOSTRAR PRIMER LA PÀGINA D'INICI
int pantalla = 1;

// FUNCIÓ PER ANAR PASSANT PANTALLES
 public void mostrarPantalla(){
    if (pantalla == 1){
        cincSegons();
        mostrarPantallaInicial();
    } else if (pantalla == 2){
        pantalla2();
        botoConfigura();
        botoJugar();
        botoSortir();
    } else if (pantalla == 3) {
        pantallaConfiguracio();
        botoMenuPrincipal();
    } else if (pantalla ==4){
        pantallaJoc();
        botoMenuPrincipalJoc();
    } else if (pantalla == 5){
        cincSegonsComiat();
        pantallaComiat();
    }
}

    //PANTALLES
//PANTALLA 1 - INICI
 public void cincSegons(){
    float sec1 = millis();
    System.out.println(sec1);
    System.out.println(pantalla);
    float sec2 = 5000;
    if(sec2<sec1){
        pantalla = 2;
    }
    System.out.println("2->"+ sec2);
}
 public void mostrarPantallaInicial(){
    text("Felicitació nadalenca", 50, 50);
    text("Dades Empresa", 50, 150);
}
//PANTALLA 2 - MENÚ INICIAL
//variables per posicionar els botons
    //amplada i alçada dels botons
int widthBotons2 = 120;
int heightBotons2 = 50;
    // x, y botons
int yB2 = 200;
int xB2 = 150;
int incrementxB2 = 200;
//funcions dels botons
 public void botoConfigura(){
    if(mousePressed){
        if(mouseY > yB2 && mouseY < (yB2+heightBotons2)){
            if(mouseX > xB2 && mouseX < xB2+widthBotons2){
                pantalla = 3;
            }
        }
    } 
}
 public void botoJugar(){
    if(mousePressed){
        if(mouseY > yB2 && mouseY < (yB2+heightBotons2)){
            if(mouseX > xB2+incrementxB2 && mouseX < xB2+incrementxB2+widthBotons2){
                pantalla = 4;
            }
        }
    } 
}
 public void botoSortir(){
    float x = xB2 + incrementxB2*2;
    float y = xB2 + incrementxB2*2 + widthBotons2;
    if(mousePressed){
        if(mouseY > yB2 && mouseY < (yB2+heightBotons2)){
            if(mouseX > x && mouseX < y){
                pantalla = 5;
            }
        }
    } 
}
// crear elements de la pantalla (botons i textos)
 public void pantalla2(){
    //botó configura
    rect(xB2, yB2, widthBotons2, heightBotons2, 10);
    textSize(22);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("Configura", xB2+12, yB2+10);
    fill(255,255,255);
    //botó jugar
    rect(xB2+incrementxB2, yB2, widthBotons2, heightBotons2, 10);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("Jugar", xB2+incrementxB2+12, yB2+10);
    fill(255,255,255);
    //boto sortir
    rect(xB2+incrementxB2*2, yB2, widthBotons2, heightBotons2, 10);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("Sortir", xB2+incrementxB2*2+12, yB2+10);
    fill(255,255,255);
}
// PANTALLA 3 - CONFIGURACIÓ
//crear i mostrar botons i textos
 public void pantallaConfiguracio(){
    textSize(20);
    fill(255,255,255);
    //MÚSICA
    rect(50, 50, 100, 30, 10);
    rect(80, 90, 100, 30, 10);
    rect(80, 130, 100, 30, 10);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("MÚSICA", 62,54);
    text("Música 1", 92,94);
    text("Música 2", 92,134);
    //IMATGE
    fill(255,255,255);
    rect(50, 200, 100, 30, 10);
    rect(80, 240, 100, 30, 10);
    rect(80, 280, 100, 30, 10);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("IMATGE", 62,204);
    text("Imatge 1", 92,244);
    text("Imatge 2", 92,284);
    //MENÚ INICIAL
    fill(255,255,255);
    rect(50, 350, 150, 30, 10);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("Menú principal", 62, 354);
}
// Funcionalitat del botó 'Menú principal'
 public void botoMenuPrincipal(){
    int x1 = 50;
    int x2 = 50 + 150;
    int y1 = 350;
    int y2 = 350 + 30;
    if(mousePressed){
        if(mouseY > y1 && mouseY < y2){
            if(mouseX > x1 && mouseX < x2){
                pantalla = 2;
            }
        }
    } 
}
//PANTALLA 4 - JOC
 public void pantallaJoc(){
    fill(255,255,255);
    //cronòmetre
    float crono = millis();
    crono = crono/1000;
    String temps = "Comptador: "+ crono;
    text(temps, 20,20);
    //resta d'elements de la pantalla
    textAlign(CENTER, CENTER);
    textSize(16);
    text("El joc consisteix en una batalla entre els reis i el Pare Noel. Caldrà escollir un dels dos personatges i aconseguir el màxim de regals possibles fent rebotar una bola sobre una pala. S'hi podrà jugar sol o amb una altra persona.", 100, 100, 600, 200);
    fill(255,255,255);
    //botó 'Menú principal'
    rect(200, 350, 150, 30, 10);
    fill(0, 0, 0);
    textAlign(LEFT, TOP);
    text("Menú principal", 222, 354);
}
//funcionalitat
 public void botoMenuPrincipalJoc(){
    int x1 = 200;
    int x2 = 200 + 150;
    int y1 = 350;
    int y2 = 350 + 30;
    if(mousePressed){
        if(mouseY > y1 && mouseY < y2){
            if(mouseX > x1 && mouseX < x2){
                pantalla = 2;
            }
        }
    } 
}
//PANTALLA 5 - COMIAT
 public void pantallaComiat(){
    text("Imatge nadalenca", 100, 150);
    text("Comiat nadalenc", 100, 250);
}
//variables per establir el frameRate (hi posem el que hem posat a la funció setup) i per a poder crear el comptador
float lapse = 0;
int segons = 0;
int frameRate = 60;
 public void cincSegonsComiat(){
    //com que frameRate = 60, la funció s'executara 60 cops per segon. Per tant cada 60 frames sumem un segon.
    int cincSegons = 5;
    lapse++;
    if(lapse == frameRate){
        segons++;
        lapse = 0;
    }
    println(segons);
    if(segons == cincSegons){
        exit();
    }
}


//FUNCIONS SETUP I DRAW
 public void setup() {
    /* size commented out by preprocessor */;
    frameRate (60);
    textSize(50);
    rectMode(CORNER);
}
 public void draw() {
    background (0, 0, 0);
    mostrarPantalla();
}


  public void settings() { size(800, 600); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Processing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
