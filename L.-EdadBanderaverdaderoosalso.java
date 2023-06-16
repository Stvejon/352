package com.mycompany.edadbandera;
public class EdadBandera {
    public static void main(String[] args) {
        int edadJuan = 22, edadPedro = 20;
        boolean bandera1;
        bandera1 = (edadJuan > edadPedro);
        System.out.println("Resultado de bandera 1: " + bandera1);
        
        int edadLupe = 35;
        boolean bandera2;
        boolean bandera3;
        bandera2 = (edadLupe < edadPedro);
        bandera3 = (bandera1 && bandera2);
        System.out.println("Resultado de bandera 3: " + bandera3);
    }
}
