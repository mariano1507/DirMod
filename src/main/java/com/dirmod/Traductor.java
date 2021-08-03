package com.dirmod;

class Traductor {

    public Traductor() {

    }

    public String translate(String menssaje) {

        if (menssaje.isEmpty()) return "No se ingreso texto";
        String resp = "";
        String[] arrayWord = menssaje.split(" ");                                   //-- Separo el mensaje en un arreglo de palabras

        
        for (int j = 0; j < arrayWord.length; j++) {                                //-- Recorro el arreglo de palabras
            String word = arrayWord[j];
            for (int i = 0; i < word.length(); i++) {                               //-- Recorro la palabra
                char letter = word.charAt(i);                                       //-- Obtengo la letra de la palabra

                String codLetter = letterToCode(letter);                            //-- Convierto la letra en secuencia de números
                
                if (codLetter.isEmpty()) codLetter = numToCode(letter);             //-- Convierto la letra en secuencia de números
                
                if (resp.length() > 0) {                                            //-- Verifico q no sea la primera letra
                    char codPrevLetter = resp.charAt(resp.length() - 1);            //-- Obtengo el úlitmo caracter de resp
                    char codLetter1 = codLetter.charAt(codLetter.length() - 1);     //-- Obtengo el úlitmo caracter de la secuencia de números

                    if (codPrevLetter == codLetter1)                                //-- Compruebo que no se repita el número para separar la secuencia
                        resp += " ";
                }
                resp += codLetter;
            }
            if (j != (arrayWord.length - 1))
                resp += "0";
        }
        return resp;
    }

    public String letterToCode(char letra) {
        String resp = "";
        switch (letra) {
            case 'a':
                resp += "2";
                break;
            case 'b':
                resp += "22";
                break;
            case 'c':
                resp += "222";
                break;
            case 'd':
                resp += "3";
                break;
            case 'e':
                resp += "33";
                break;
            case 'f':
                resp += "333";
                break;
            case 'g':
                resp += "4";
                break;
            case 'h':
                resp += "44";
                break;
            case 'i':
                resp += "444";
                break;
            case 'j':
                resp += "5";
                break;
            case 'k':
                resp += "55";
                break;
            case 'l':
                resp += "555";
                break;
            case 'm':
                resp += "6";
                break;
            case 'n':
                resp += "66";
                break;
            case 'o':
                resp += "666";
                break;
            case 'p':
                resp += "7";
                break;
            case 'q':
                resp += "77";
                break;
            case 'r':
                resp += "777";
                break;
            case 's':
                resp += "7777";
                break;
            case 't':
                resp += "8";
                break;
            case 'u':
                resp += "88";
                break;
            case 'v':
                resp += "888";
                break;
            case 'w':
                resp += "9";
                break;
            case 'x':
                resp += "99";
                break;
            case 'y':
                resp += "999";
                break;
            case 'z':
                resp += "9999";
                break;
        }
        return resp;
    }

    public String numToCode(char numero) {
        String resp = "";
        switch (numero) {
            case '1':
                resp += "11";
                break;
            case '2':
                resp += "2222";
                break;
            case '3':
                resp += "3333";
                break;
            case '4':
                resp += "4444";
                break;
            case '5':
                resp += "5555";
                break;
            case '6':
                resp += "6666";
                break;
            case '7':
                resp += "77777";
                break;
            case '8':
                resp += "8888";
                break;
            case '9':
                resp += "99999";
                break;
            case '0':
                resp += "00";
                break;
        }
        return resp;
    }

}