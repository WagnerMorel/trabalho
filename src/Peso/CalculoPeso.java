


package Peso;

/* @author Wagner Morel */


public class CalculoPeso {
    
    private double mercurio;
    private double venus;
    private double marte;
    private double jupiter;
    private double saturno;
    private double urano;
    private double pesoTerra;
    private double resultado;

 
    public double getMercurio() {
        return mercurio;
    }

    
    public void setMercurio(double mercurio) {
        this.mercurio = mercurio;
    }

  
    public double getVenus() {
        return venus;
    }

 
    public void setVenus(double venus) {
        this.venus = venus;
    }

 
    public double getMarte() {
        return marte;
    }


    public void setMarte(double marte) {
        this.marte = marte;
    }


    public double getJupiter() {
        return jupiter;
    }

 
    public void setJupiter(double jupiter) {
        this.jupiter = jupiter;
    }


    public double getSaturno() {
        return saturno;
    }


    public void setSaturno(double saturno) {
        this.saturno = saturno;
    }


    public double getUrano() {
        return urano;
    }


    public void setUrano(double urano) {
        this.urano = urano;
    }

  
    public double getPesoTerra() {
        return pesoTerra;
    }


    public void setPesoTerra(double pesoTerra) {
        this.pesoTerra = pesoTerra;
    }


    public double getResultado() {
        return resultado;
    }


    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
   public void Mercurio(double pesoTerra ){
       resultado = pesoTerra/10 * 0.37;
   
   }
   
    public void Venus(double pesoTerra ){
       resultado = pesoTerra/10 * 0.88;
   
   }
    
     public void Marte(double pesoTerra ){
       resultado = pesoTerra/10 * 0.38;
   
   }
     
     public void Jupiter(double pesoTerra ){
       resultado = pesoTerra/10 * 2.64;
   
   }
      
     public void Saturno(double pesoTerra ){
       resultado = pesoTerra/10 * 1.15;
   
   }
       
     public void Urano(double pesoTerra ){
       resultado = pesoTerra/10 * 1.17 ;
   
   }


}
