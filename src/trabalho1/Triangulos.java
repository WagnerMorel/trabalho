/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author Wagner Morel
 */
public class Triangulos {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int resultado;

    public Triangulos(String ladoA, String ladoB, String ladoC) {

        this.ladoA = Integer.parseInt(ladoA);
        this.ladoB = Integer.parseInt(ladoB);
        this.ladoC = Integer.parseInt(ladoC);
    }

    public Triangulos(int ladoA, int ladoB, int ladoC) {

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    Triangulos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public String getResultado() {
        if(ladoA==ladoB && ladoA == ladoC){
            return "Equilátero";
        }
    
        else if (ladoA == ladoB && ladoC != ladoA){
          return "Isoceles";
    }
        else if (ladoA != ladoC && ladoB != ladoA){
          return "Escaleno";
        }
          

    }



    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

} 

