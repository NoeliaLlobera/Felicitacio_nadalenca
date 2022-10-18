// //BOTONS
int pantallaX = 800;
int pantallaY = 600;
int butonsP2X = 1;
// AQUESTA VARIABLE LI DIU AL PROGRAMA QUINA PANTALLA HA DE MOSTRAR. LA INICIALITZEM AMB VALOR 1 PER MOSTRAR PRIMER LA PÀGINA D'INICI
int pantalla = 1;

// FUNCIÓ PER ANAR PASSANT PANTALLES
void mostrarPantalla(){
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
void cincSegons(){
    float sec1 = millis();
    System.out.println(sec1);
    System.out.println(pantalla);
    float sec2 = 5000;
    if(sec2<sec1){
        pantalla = 2;
    }
    System.out.println("2->"+ sec2);
}
void mostrarPantallaInicial(){
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
void botoConfigura(){
    if(mousePressed){
        if(mouseY > yB2 && mouseY < (yB2+heightBotons2)){
            if(mouseX > xB2 && mouseX < xB2+widthBotons2){
                pantalla = 3;
            }
        }
    } 
}
void botoJugar(){
    if(mousePressed){
        if(mouseY > yB2 && mouseY < (yB2+heightBotons2)){
            if(mouseX > xB2+incrementxB2 && mouseX < xB2+incrementxB2+widthBotons2){
                pantalla = 4;
            }
        }
    } 
}
void botoSortir(){
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
void pantalla2(){
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
void pantallaConfiguracio(){
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
void botoMenuPrincipal(){
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
void pantallaJoc(){
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
void botoMenuPrincipalJoc(){
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
void pantallaComiat(){
    text("Imatge nadalenca", 100, 150);
    text("Comiat nadalenc", 100, 250);
}
//variables per establir el frameRate (hi posem el que hem posat a la funció setup) i per a poder crear el comptador
float lapse = 0;
int segons = 0;
int frameRate = 60;
void cincSegonsComiat(){
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
void setup() {
    size(800, 600);
    frameRate (60);
    textSize(50);
    rectMode(CORNER);
}
void draw() {
    background (0, 0, 0);
    mostrarPantalla();
}