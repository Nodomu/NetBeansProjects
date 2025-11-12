package practicamtrz;


public class Codigo {
    int matriz1 [][];
    int matriz2 [][];
    int filas1;
    int filas2;
    int columnas1;
    int columnas2;
    
    public Codigo()
    {
        matriz1 = null;
        matriz2 = null;
        filas1 = 0;
        filas2 = 0;
        columnas1 = 0;
        columnas2= 0;
    }

    public int getFilas1() {
        return filas1;
    }

    public void setFilas1(int filas1) {
        this.filas1 = filas1;
    }

    public int getFilas2() {
        return filas2;
    }

    public void setFilas2(int filas2) {
        this.filas2 = filas2;
    }

    public int getColumnas1() {
        return columnas1;
    }

    public void setColumnas1(int columnas1) {
        this.columnas1 = columnas1;
    }

    public int getColumnas2() {
        return columnas2;
    }

    public void setColumnas2(int columnas2) {
        this.columnas2 = columnas2;
    }
    
    public void setMatriz(int f, int c, int dato){
        matriz1[f][c] = dato;
    }
    public int getMatriz1(int f, int c){
        return matriz1[f][c];
    }
    
    public void setMatriz2(int f1, int c1, int dato){
        matriz2[f1][c1] = dato;
    }
    
    public int getMatriz2(int f, int c){
        return matriz2[f][c];
    }
    
    public void crearM(){
        matriz1 = new int [getFilas1()][getColumnas1()];
        matriz1 = new int [getFilas1()][getColumnas1()];
    }
    
    public String Mostrar1(){
        String m = "";
        for(int f = 0; f<getFilas1(); f++){
            for(int c = 0; c<getColumnas1(); c++){
                 m += getMatriz1(f,c);
            }
            m+="n";
        }
        return m;
    }
    
     public String Mostrar2(){
        String m = "";
        for(int f = 0; f<getFilas1(); f++){
            for(int c = 0; c<getColumnas1(); c++){
                 m += getMatriz2(f,c);
            }
            m+="n";
        }
        return m;
    } 
    
}

